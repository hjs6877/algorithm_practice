package com.itvillage.algorithm_site.codeup.recursive;

import java.util.Scanner;

public class CodeUp1912 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = factorial(n);

        System.out.print(result);
    }

    private static int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
