package com.itvillage.lecture.algroithm_with_python.section07;

import java.util.Scanner;

/**
 * 휴가
 * - 정해진 기간 안에 가장 많은 휴가비 벌기
 */
public class Section07Problem02 {
    static int n;
    static int[][] tp;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        tp = new int[n][2];

        for (int i = 0; i < n; i++) {
            tp[i][0] = scanner.nextInt();
            tp[i][1] = scanner.nextInt();
        }

        int maxPrice = Integer.MIN_VALUE;

        dfs(0, 0, 0);
    }

    private static void dfs(int level, int t, int p) {
        if (t > n) {
            return;
        }

        if (t == n) {

        } else {
            for (int i = 0; i < n; i++) {
                dfs(level + 1, t + tp[i][0], p + tp[i][1]);
                dfs(level + 1, t, p);
            }
        }


    }

}
