package com.itvillage.lecture.algroithm_with_python.section03;

import java.util.Scanner;

/**
 * 격자판에서 최대 합 찾기
 */
public class Section03Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int crossSum01 = 0;
        int crossSum02 = 0;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            maxSum = Math.max(maxSum, rowSum);
            maxSum = Math.max(maxSum, colSum);

            crossSum01 += arr[i][i];
            crossSum02 += arr[i][n - 1 - i];
        }

        maxSum = Math.max(maxSum, crossSum01);
        maxSum = Math.max(maxSum, crossSum02);

        System.out.print(maxSum);
    }
}
