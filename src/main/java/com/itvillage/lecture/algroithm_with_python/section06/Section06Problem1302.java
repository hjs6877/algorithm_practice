package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 경로 탐색(그래프 DFS) : 인접 행렬 사용
 */
public class Section06Problem1302 {
    static int[][] metrics;
    static int n;
    static int result;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int m = scanner.nextInt();
        visited = new boolean[n + 1];
        metrics = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            metrics[scanner.nextInt()][scanner.nextInt()] = 1;
        }

        dfs(1);
        System.out.print(result);
    }

    private static void dfs(int v) {
        visited[v] = true;

        if (v == n) {
            result++;
            return;
        } else {
            for (int i = 1; i < n + 1; i++) {
                if (metrics[v][i] == 1) {
                    if (!visited[i]) {
                        dfs(i);
                        visited[i] = false;
                    }
                }
            }
        }
    }
}
