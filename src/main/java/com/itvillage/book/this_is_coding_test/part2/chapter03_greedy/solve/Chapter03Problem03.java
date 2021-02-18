package com.itvillage.book.this_is_coding_test.part2.chapter03_greedy.solve;

import java.util.Scanner;

public class Chapter03Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int min = arr[i][0];
            for (int j = 0; j < m; j++) {
                min = Math.min(min, arr[i][j]);
            }
            max = Math.max(max, min);
        }

        System.out.print(max);
    }
}
