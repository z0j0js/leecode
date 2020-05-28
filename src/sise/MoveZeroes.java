package sise;

import java.util.Arrays;

/**
 * 第 283 题
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 要求：必须在原数组上操作，不能拷贝额外的数组；尽量减少操作次数
 * 设定两个指针，i指针记录循环遍历的数组位置，j指针记录数组中最前第一个零的位置
 * 采用快速排序的思想，以零当作中间点，往后找到不为零的数，就与前面为零的数交换，达到将零向后移的目的
 */
public class MoveZeroes {
    public static int[] moveZeroes(int[] nums) {
        if(nums==null) {
            return null;
        }
        //两个指针i和j
        int j = 0;
        for(int i=0;i<nums.length;i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if(nums[i]!=0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0, 1, 0, 3, 12})));
    }
}
