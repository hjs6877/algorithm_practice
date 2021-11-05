package com.itvillage.algorithm_site.leetcode.easy;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] result = shuffle(nums, n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int m = 0;
        int k = 1;
        for (int i = 0; i < n; i++) {
            result[m] = nums[i];
            result[k] = nums[i + n];
            m = m + 2;
            k = k + 2;
        }
        return result;
    }
}
