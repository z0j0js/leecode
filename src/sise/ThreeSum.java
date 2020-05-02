package sise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题目：三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
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
