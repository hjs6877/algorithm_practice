package com.itvillage.algorithm_site.leetcode.easy;

public class ReplaceAllDigits {
    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        String result = replaceDigits(s);

        System.out.println(result);
    }

    public static String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                char ch = (char) (s.charAt(i - 1) + Character.getNumericValue(s.charAt(i)));
                sb.append(ch);
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
