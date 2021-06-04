package com.itvillage.lecture.algroithm_with_python.section07;

import java.util.Scanner;

/**
 * 최대 점수 구하기 Practice01
 */
public class Section07Problem01Practice01 {
    static int m, n;
    static int maxPoint = Integer.MIN_VALUE;
    static int[] p, t;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        p = new int[n];
        t = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
            t[i] = scanner.nextInt();
        }

        dfs(0, 0, 0);
        System.out.print(maxPoint);
    }

    private static void dfs(int level, int pSum, int tSum) {
        if (tSum > m) {
            return;
        }

        if (level == n) {
            maxPoint = Math.max(maxPoint, pSum);
        } else {
            dfs(level + 1, pSum + p[level], tSum + t[level]);
            dfs(level + 1, pSum, tSum);
        }
    }
}
