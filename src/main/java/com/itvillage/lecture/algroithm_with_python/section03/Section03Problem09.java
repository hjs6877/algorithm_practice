package com.itvillage.lecture.algroithm_with_python.section03;

import java.util.Scanner;

/**
 * 봉우리 개수 구하기
 */
public class Section03Problem09 {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int n;
    public static int[][] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isTop(i, j)) count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isTop(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
            if (arr[x][y] < arr[nx][ny]) return false;
        }
        return true;
    }
}
