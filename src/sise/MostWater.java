package sise;

/**
 * 第 11 题：给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 最大面积取决于两点: 1.区域受限于较短边 2.相同情况下两边距离越远越好
 * 设定双指针在数组两端，左边和右边比较，大的一端保持不动，小的一端向对方靠拢，比较n次，每次保存当前面积大小，最后返回最大面积
 *
 */
public class MostWater {

    public static int maxArea(int[] height){
        int l=0;
        int r=height.length-1;
        int maxarea=0;
        while (l<r){
            maxarea = Math.max(maxarea, Math.min(height[l],height[r])*(r-l));
            if (height[l]<height[r]){
                l++;
            }else {
                r--;
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
