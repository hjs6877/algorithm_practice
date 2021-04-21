package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 인접 행렬(가중치 방향 그래프)
 */
public class Section06Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[][] metrics = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            metrics[arr[i][0] - 1][arr[i][1] - 1] = arr[i][2];
        }

        for (int i = 0; i < metrics.length; i++) {
            for (int j = 0; j < metrics[i].length; j++) {
                System.out.print(metrics[i][j] + " ");
            }
            System.out.println();
        }
    }
}
