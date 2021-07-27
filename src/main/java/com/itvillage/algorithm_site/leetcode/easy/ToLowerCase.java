package com.itvillage.algorithm_site.leetcode.easy;

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "LOVELY";
        String result = toLowerCase(s);

        System.out.println(result);
    }

    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
