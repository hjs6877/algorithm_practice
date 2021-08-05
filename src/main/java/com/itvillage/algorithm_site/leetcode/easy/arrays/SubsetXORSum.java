package com.itvillage.algorithm_site.leetcode.easy.arrays;

public class SubsetXORSum {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8};
        int result = subsetXORSum(nums);

        System.out.println(result);
    }

    public static int subsetXORSum(int[] nums) {
        int sum = 0;
        for(int i=0; i < 1<<nums.length; i++) {
            int tmp = 0;
            for(int j=0; j<nums.length; j++) {
                if((i & 1<<j) != 0)
                    tmp = tmp ^ nums[j];
            }
            sum += tmp;
        }
        return sum;
    }
}
