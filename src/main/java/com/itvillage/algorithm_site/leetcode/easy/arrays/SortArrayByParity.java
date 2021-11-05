package com.itvillage.algorithm_site.leetcode.easy.arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] result = sortArrayByParity(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] sorted = new int[nums.length];

        for (int i = 0, j = nums.length - 1, k = 0; k < nums.length; k++) {
            if (nums[k] % 2 == 0) {
                sorted[i] = nums[k];
                i++;
            } else {
                sorted[j] = nums[k];
                j--;
            }
        }
        return sorted;
    }
}
