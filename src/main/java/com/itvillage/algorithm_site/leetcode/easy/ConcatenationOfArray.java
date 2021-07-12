package com.itvillage.algorithm_site.leetcode.easy;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = getConcatenation(nums);

        for (int n : result) {
            System.out.printf("%d ", n);
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = Arrays.copyOf(nums, nums.length * 2);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);

        return ans;
    }
}
