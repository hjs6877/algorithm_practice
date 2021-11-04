package com.itvillage.algorithm_site.leetcode.easy.arrays;

import java.util.Arrays;

public class ArrayPartitionI {
    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 1, 2};
        int result = arrayPairSum(nums);

        System.out.print(result);
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }
}
