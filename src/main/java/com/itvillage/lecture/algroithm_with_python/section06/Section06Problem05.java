package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 바둑이 승차
 */
public class Section06Problem05 {
    static int max = -1;
    static int c;
    static int n;
    static int[] nodes;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        n = scanner.nextInt();
        nodes = new int[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = scanner.nextInt();
        }
        dfs(0, 0);

        System.out.print(max);
    }

    private static void dfs(int i, int sum) {
        if( sum > c) return;
        if (i == n) {
            max = Math.max(max, sum);
        } else {
            dfs(i + 1, sum + nodes[i]);
            dfs(i + 1, sum);
        }
    }
}
