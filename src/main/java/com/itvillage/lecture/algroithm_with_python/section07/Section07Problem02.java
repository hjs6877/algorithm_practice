package com.itvillage.lecture.algroithm_with_python.section07;

import java.util.Scanner;

/**
 * 휴가
 * - 정해진 기간 안에 가장 많은 휴가비 벌기
 */
public class Section07Problem02 {
    static int n;
    static int[][] tp;
    static int maxPrice;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        tp = new int[n + 1][2];

        for (int i = 1; i <= n; i++) {
            tp[i][0] = scanner.nextInt();
            tp[i][1] = scanner.nextInt();
        }

        maxPrice = Integer.MIN_VALUE;

        dfs(1, 0);

        System.out.println(maxPrice);
    }

    private static void dfs(int level, int sum) {
        if (level == n + 1) {
            maxPrice = Math.max(maxPrice, sum);
        } else {
            if (level + tp[level][0] <= n + 1) {
                dfs(level + tp[level][0], sum + tp[level][1]);
            } else {
                dfs(level + 1, sum);
            }
        }


    }

}
