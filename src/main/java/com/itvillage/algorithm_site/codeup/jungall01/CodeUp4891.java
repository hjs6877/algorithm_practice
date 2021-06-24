package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4891 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] points = new int[n];

        for (int i = 0; i < points.length; i++) {
            points[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            max = Math.max(max, points[i]);
            min = Math.min(min, points[i]);
        }

        System.out.print(max - min);
    }
}
