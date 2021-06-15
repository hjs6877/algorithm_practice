package com.itvillage.algorithm_site.codeup.recursive;

import java.util.Scanner;

public class CodeUp1953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        func(n, "*");
    }

    private static void func(int n, String star) {
        if (n == 0) {
            return;
        } else {
            System.out.println(star);
            func(n - 1, star + "*");
        }
    }
}
