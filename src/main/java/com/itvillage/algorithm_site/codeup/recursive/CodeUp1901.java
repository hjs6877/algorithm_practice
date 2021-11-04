package com.itvillage.algorithm_site.codeup.recursive;

import java.util.Scanner;

public class CodeUp1901 {
    private static int i = 1;
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        printFromN(i);
    }

    private static void printFromN(int i) {
        System.out.println(i++);
        if (i <= n) {
            printFromN(i);
        }
    }
}
