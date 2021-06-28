package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = 0;

        if (n <= 500) {
            result = n * 70 / 100;
        } else if (n > 500 && n <= 1500) {
            result = 350 + (n - 500) * 40 / 100;
        } else if (n > 1500 && n <= 4500) {
            result = 750 + (n - 1500) * 15 / 100;
        } else if (n > 4500 && n <= 10000) {
            result = 1200 + (n - 4500) * 5 / 100;
        } else if (n > 10000) {
            result = 1475 + (n - 10000) * 2 / 100;
        }

        System.out.println(result);
    }
}
