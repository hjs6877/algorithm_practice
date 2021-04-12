package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.ArrayList;
import java.util.List;

/**
 * 트리 전위 순회(DFS)
 */
public class Section06Problem02 {
    private static List<List<Integer>> graph = new ArrayList<>();
    private static boolean[] visited = new boolean[8];
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);

        graph.get(2).add(4);
        graph.get(2).add(5);

        graph.get(3).add(6);
        graph.get(3).add(7);

        dfs(1);

    }

    private static void dfs(int x) {
        visited[x] = true;

        System.out.print(x + " ");

        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if(!visited[y]) {
                dfs(y);
            }
        }
    }
}
