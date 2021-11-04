package com.itvillage.algorithm_site.leetcode.easy;

import java.util.Arrays;

public class MaxProductDifference {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 9, 7, 4, 8};
        int result = maxProductDifference(nums);
        System.out.print(result);
    }

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}
