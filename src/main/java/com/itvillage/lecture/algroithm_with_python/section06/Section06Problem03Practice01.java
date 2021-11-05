package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 부분 집합 구하기(DFS) Practice01
 */
public class Section06Problem03Practice01 {
    static boolean[] used;
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        used = new boolean[n + 1];

        dfs(1);
    }

    private static void dfs(int v) {
        if (v == n + 1) {
            for (int i = 0; i < used.length; i++) {
                if (used[i]) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            used[v] = true;
            dfs(v + 1);

            used[v] = false;
            dfs(v + 1);
        }
    }
}
