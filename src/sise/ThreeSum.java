package sise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 第 15 题
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 *
 * 采用两数和的方式：先将给定数组排序，使用三个指针，第一个指针进行遍历操作 ，分别放在数组的每一个为位置，另外两个指针，放在第一个指针+1的为左指针，放在数组最后一位的为右指针。
 * 假如两端指针的合比第一个指针数的相反数要小，需要将左指针右移，反之需要将右指针左移，找到和为零的三个一组数。
 * 去重的办法：找到合适的左右指针数，就 while 比较相近的位置数是否相同，相同则跳过。且在第一个指针for循环时，假如遇到与上一个值相同的值会直接跳过此循环。
 */

public class ThreeSum {
    private static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length==0){
            return result;
        }
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++){
            if (i>0 && nums[i]==nums[i-1]) continue;
            int target = -nums[i];
            int j=i+1; //left pointer
            int k=nums.length-1; //right pointer
            while (j<k){
                if (nums[j]+nums[k]==target){
                    List<Integer> curr = new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(nums[k]);
                    result.add(curr);
                    j++;
                    k--;
                    while (j<nums.length && nums[j]==nums[j-1]) j++;
                    while (k>j && nums[k]==nums[k+1]) k--;
                }else if (nums[j]+nums[k]>target) {
                    k--;
                }else {
                    j++;
                }
            }

        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(ThreeSum.threeSum(new int[] {-1,0,1,2,-1,-4}));
    }
}
