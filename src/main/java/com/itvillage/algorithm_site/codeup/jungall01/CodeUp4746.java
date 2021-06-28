package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4746 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int s = c + d;
        int m = b + (s / 60);
        int h = a + (m / 60);
        int realS = s % 60;
        int realM = m % 60;
        int realH = h % 24;

        System.out.printf("%d %d %d", realH, realM, realS);
    }
}
