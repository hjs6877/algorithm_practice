package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 바둑이 승차 Practice01
 */
public class Section06Problem05Practice01 {
    static int n;
    static int c;
    static int[] w;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        n = scanner.nextInt();
        w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }

        dfs(0, 0);
        System.out.print(max);
    }

    private static void dfs(int level, int sum) {
        if (sum > c) {
            return;
        }
        if (level == n) {
            max = Math.max(sum, max);
        } else {
            dfs(level + 1, sum + w[level]);
            dfs(level + 1, sum);
        }
    }
}
