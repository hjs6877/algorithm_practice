package com.itvillage.lecture.algroithm_with_python.section03;

import java.util.Scanner;

/**
 * 사과 나무(다이아몬드)
 */
public class Section03Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        int s = n / 2;
        int e = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = s; j <= e; j++) {
                sum += arr[i][j];
            }
            if (i < n / 2) {
                s--;
                e++;
            } else {
                s++;
                e--;
            }
        }

        System.out.println(sum);
    }
}
