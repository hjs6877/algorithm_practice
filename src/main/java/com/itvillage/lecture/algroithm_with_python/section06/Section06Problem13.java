package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 경로 탐색(그래프 DFS)
 */
public class Section06Problem13 {
    static List<List<Integer>> graph = new ArrayList<>();
    static int n;
    static int result;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int m = scanner.nextInt();
        visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            graph.get(scanner.nextInt()).add(scanner.nextInt());
        }

        
        dfs(1);
        System.out.print(result);
    }

    private static void dfs(int v) {
        visited[v] = true;

        for (int i = 0; i < graph.get(v).size(); i++) {
            int y = graph.get(v).get(i);

            if (y == n) {
                result++;
                return;
            } else if(!visited[y]){
                dfs(y);
                visited[y] = false;
            }
        }
    }
}
