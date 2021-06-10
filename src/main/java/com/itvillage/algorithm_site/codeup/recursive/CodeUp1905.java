package com.itvillage.algorithm_site.codeup.recursive;

import java.util.Scanner;

public class CodeUp1905 {
    static int num, n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        func(0);
    }

    private static void func(int sum) {
        if (num == n) {
            System.out.print(sum);
            return;
        } else {
            num++;
            func(sum + num);
        }
    }
}
