package com.itvillage.algorithm_site.codeup.recursive;

import java.util.Scanner;

public class CodeUp1916 {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        fibonacci(1, 0, 1);
    }

    private static void fibonacci(int idx, int prev, int cur) {
        int temp = prev;
        prev = cur;
        cur = (temp + cur) % 10009;

        if (idx == n) {
            System.out.print(prev);
        } else {
            fibonacci(idx + 1, prev, cur);
        }
    }
}
