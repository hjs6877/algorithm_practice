package com.itvillage.algorithm_site.leetcode.easy;

public class FindSumZero {
    public static void main(String[] args) {
        int n = 6;
        int[] result = sumZero(n);

        for (int r : result) {
            System.out.print(r + ", ");
        }
    }

    public static int[] sumZero(int n) {
        int[] sum = new int[n];

        if (n == 1) {
            sum[0] = 0;
        } else {
            for (int i = 0, j = 1; i < n; i = i + 2, j++) {
                if (n % 2 == 1 && i == n - 1) {
                    sum[i] = 0;
                } else {
                    sum[i] = j;
                    sum[i + 1] = -j;
                }
            }
        }
        return sum;
    }
}
