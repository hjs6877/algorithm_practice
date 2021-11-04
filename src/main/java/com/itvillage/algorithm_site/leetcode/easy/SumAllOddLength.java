package com.itvillage.algorithm_site.leetcode.easy;

import java.util.Arrays;

public class SumAllOddLength {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int result = sumOddLengthSubarrays(arr);

        System.out.print(result);
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j = j + 2) {
                int[] temp = Arrays.copyOfRange(arr, i, j + 1);
                sum += Arrays.stream(temp).sum();
            }
        }
        return sum;
    }
}
