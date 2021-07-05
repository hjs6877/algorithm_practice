package com.itvillage.algorithm_site.leetcode.easy;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);

        Arrays.stream(result).forEach(n -> System.out.print(n + " "));
    }

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            runningSum[i] = sum;
        }

        return runningSum;
    }
}
