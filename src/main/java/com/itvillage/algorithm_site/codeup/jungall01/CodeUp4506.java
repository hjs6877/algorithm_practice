package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4506 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcd = gcd(a, b);
        int lcm = lcm(a, b, gcd);

        System.out.println(gcd);
        System.out.println(lcm);
    }

    private static int lcm(int a, int b, int gcd) {
        return a * b / gcd;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
