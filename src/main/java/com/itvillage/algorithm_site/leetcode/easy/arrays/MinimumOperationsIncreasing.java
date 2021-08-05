package com.itvillage.algorithm_site.leetcode.easy.arrays;

public class MinimumOperationsIncreasing {
    public static void main(String[] args) {
        int[] nums = {1,5,2,4,1};
        int result = minOperations(nums);
        System.out.println(result);
    }

    public static int minOperations(int[] nums) {
        int minCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                minCount += 1;
                nums[i + 1]++;
            } else if (nums[i] > nums[i + 1]) {
                minCount += nums[i] + 1 - nums[i + 1];
                nums[i + 1] = nums[i] + 1;
            }
        }

        return minCount;
    }
}
