package com.itvillage.algorithm_site.leetcode.easy;

public class CountMatchesTournament {
    public static void main(String[] args) {
        int n = 14;
        int result = numberOfMatches(n);

        System.out.print(result);
    }

    public static int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                count = count + (n / 2);
                n = n / 2;
            } else {
                count = count + (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }

        return count;
    }
}
