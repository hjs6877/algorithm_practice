package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        a = a + (c / 60);
        b = b + (c % 60);
        a = a + (b / 60);
        b = b % 60;

        if (a >= 24) {
            a = a - 24;
        }

        System.out.printf("%d %d", a, b);

    }
}
