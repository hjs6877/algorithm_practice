package com.itvillage.algorithm_site.leetcode.easy;

public class Max69Number {
    public static void main(String[] args) {
        int num = 9999;
        int result = maximum69Number(num);

        System.out.println(result);
    }

    public static int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            if (Character.getNumericValue(str.charAt(i)) == 6) {
                sb.append('9');
                sb.append(str.substring(i + 1));
                break;
            } else {
                sb.append(str.charAt(i));
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
