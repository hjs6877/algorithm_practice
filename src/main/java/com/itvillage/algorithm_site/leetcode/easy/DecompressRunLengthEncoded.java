package com.itvillage.algorithm_site.leetcode.easy;

import java.util.Arrays;

public class DecompressRunLengthEncoded {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = decompressRLElist(nums);

        for (int n : result) {
            System.out.print(n + " ");
        }
    }

    public static int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                length += nums[i];
            }
        }
        int[] result = new int[length];
        int k = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            int freq = nums[2 * i];
            int val = nums[2 * i + 1];
            for (int j = 0; j < freq; j++) {
                result[k++] = val;
            }
        }

        return result;
    }
}
