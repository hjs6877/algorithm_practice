package com.itvillage.algorithm_site.codeup.recursive;

import java.util.Scanner;

public class CodeUp1902 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        func(n);
    }

    private static void func(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            func(--n);
        }
    }
}
