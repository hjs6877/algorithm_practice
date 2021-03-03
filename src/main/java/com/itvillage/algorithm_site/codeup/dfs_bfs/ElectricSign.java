package com.itvillage.algorithm_site.codeup.dfs_bfs;

import java.util.Scanner;

public class ElectricSign {
    public static int n, m;
    public static int[][] graph = new int[100][100];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        int onResult = 0;
        int offResult = 0;
        int[][] origin = deepCopy(graph);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j, 0, 1)) {
                    onResult++;
                }
            }
        }
        graph = origin;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j, 1, 0)) {
                    offResult++;
                }
            }
        }

        System.out.print(onResult + " " + offResult);
    }

    private static boolean dfs(int x, int y, int a, int b) {
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }

        if (graph[x][y] == a) {
            graph[x][y] = b;

            dfs(x-1, y, a, b);
            dfs(x+1, y, a, b);
            dfs(x, y-1, a, b);
            dfs(x, y+1, a, b);
            return true;
        }
        return false;
    }

    private static int[][] deepCopy(int[][] original2) {
        if(original2 == null) return null;
        int[][] result = new int[original2.length][original2[0].length];

        for(int i=0; i<original2.length; i++){
            System.arraycopy(original2[i], 0, result[i], 0, original2[0].length);
        }

        return result;
    }
}
