package sise;

/**
 * 第 206 题 反转链表
 * 反转一个单链表。可以迭代或递归地反转链表。
 *
 * 迭代方式：
 * 初始化：prev  None
 *        curr  1->2->3->null
 * 第一轮：prev  None<-1
 *        curr  2->3->null
 * 第二轮：prev  None<-1<-2
 *        curr  3->null
 * 第三轮：prev  None<-1<-2<-3
 *        curr  null
 * 结  束
 * 交换时采用swap方式
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        // 申请两个链表 一个空链表，一个完整的链表
        ListNode prev = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode temp = curr.next;
            curr.next = prev; // 当前链表指向 新链表
            prev = curr; // 赋值给新链表
            curr = temp;
        }
        return prev;
    }

    public static class ListNode
    {
        int val;
        ListNode next;

        public ListNode(int x){
            val=x;
            this.next=null;
        }
    }

    public void printListNode(ListNode l) {
        while (l != null) {
            System.out.print(l.val + " ");
            l = l.next;
        }
    }

    public static void main(String[] args) {
        ReverseList sol = new ReverseList();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        ListNode l = sol.reverseList(l1);
        sol.printListNode(l);
    }
}
