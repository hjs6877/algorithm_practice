package com.itvillage.algorithm_site.leetcode.easy.strings;

public class BalancedStrings {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        int result = balancedStringSplit(s);

        System.out.print(result);
    }

    public static int balancedStringSplit(String s) {
        int lCount = 0;
        int rCount = 0;
        int result = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'R') {
                rCount++;
            } else {
                lCount++;
            }

            if (lCount == rCount) {
                result++;
                lCount = 0;
                rCount = 0;
            }
        }

        return result;
    }
}
