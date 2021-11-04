package com.itvillage.algorithm_site.leetcode.easy;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        String result = restoreString(s, indices);
        System.out.print(result);
    }

    public static String restoreString(String s, int[] indices) {
        char[] chs = s.toCharArray();
        char[] result = new char[chs.length];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = chs[i];
        }
        return new String(result);
    }
}
