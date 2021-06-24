package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4571 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = m; i <= n; i++) {
            if (isPerfectSquare(i)) {
                sum += i;
                min = Math.min(min, i);
            }
        }

        System.out.println(sum);
        System.out.println(min);
    }

    private static boolean isPerfectSquare(int i) {
        double d = Math.sqrt(i);
        double fd = d - (int) d;
        if (fd == 0) {
            return true;
        } else {
            return false;
        }
    }
}
