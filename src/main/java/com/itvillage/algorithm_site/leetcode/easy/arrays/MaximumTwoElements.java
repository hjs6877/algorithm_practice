package com.itvillage.algorithm_site.leetcode.easy.arrays;

import java.util.Arrays;
import java.util.Collections;

public class MaximumTwoElements {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 5};
        int result = maxProduct(nums);

        System.out.println(result);
    }

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
