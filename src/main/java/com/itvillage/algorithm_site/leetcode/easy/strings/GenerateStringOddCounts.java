package com.itvillage.algorithm_site.leetcode.easy.strings;

public class GenerateStringOddCounts {
    public static void main(String[] args) {
        int n = 5;
        String result = generateTheString(n);

        System.out.println(result);
    }

    public static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                sb.append('a');
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                sb.append('a');
            }
            sb.append('b');
        }
        return sb.toString();
    }
}
