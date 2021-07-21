package com.itvillage.algorithm_site.leetcode.easy;

public class XOROperation {
    public static void main(String[] args) {
        int n = 10;
        int start = 5;
        int result = xorOperation(n, start);

        System.out.print(result);
    }

    public static int xorOperation(int n, int start) {
        if(n == 1) return start;

        int next = start + 2 * 1;
        int xor = start ^ next;
        for (int i = 2; i < n; i++) {
            xor = xor ^ start + 2 * i;;
        }

        return xor;
    }
}
