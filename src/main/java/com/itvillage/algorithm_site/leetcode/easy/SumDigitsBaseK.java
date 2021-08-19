package com.itvillage.algorithm_site.leetcode.easy;

public class SumDigitsBaseK {
    public static void main(String[] args) {
        int n = 68;
        int k = 2;
        int result = sumBase(n, k);

        System.out.print(result);
    }

    public static int sumBase(int n, int k) {
        int q = n;
        int r;
        int sum = 0;
        while (q > 0) {
            r = q % k;
            sum += r;
            q = q / k;

        }
        return sum;
    }
}
