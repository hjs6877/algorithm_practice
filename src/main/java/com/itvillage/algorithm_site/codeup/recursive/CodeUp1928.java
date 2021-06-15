package com.itvillage.algorithm_site.codeup.recursive;

import java.util.Scanner;

public class CodeUp1928 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        func(n);
    }

    private static void func(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        } else {
            if (n % 2 == 1) {
                func(3 * n + 1);
            } else {
                func(n / 2);
            }
            System.out.println(n);
        }
    }
}
