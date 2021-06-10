package com.itvillage.algorithm_site.codeup.recursive;

import java.util.Scanner;

public class CodeUp1904 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        func(a, b);
    }

    private static void func(int a, int b) {
        if (a > b) {
            return;
        } else {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
            func(++a, b);
        }
    }
}
