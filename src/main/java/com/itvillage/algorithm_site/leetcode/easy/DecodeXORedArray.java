package com.itvillage.algorithm_site.leetcode.easy;

public class DecodeXORedArray {
    public static void main(String[] args) {
        int[] encoded = {1, 2, 3};
        int first = 1;
        int[] result = decode(encoded, first);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            int decoded = first ^ encoded[i];
            result[i + 1] = decoded;
            first = decoded;
        }

        return result;
    }
}
