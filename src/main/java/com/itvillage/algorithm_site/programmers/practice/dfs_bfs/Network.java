package com.itvillage.algorithm_site.programmers.practice.dfs_bfs;


public class Network {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        int answer = solution(n, computers);

        System.out.println(answer);
    }
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];

        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]) {
                answer++;

                dfs(i, visited, computers);
            }
        }
        return answer;
    }

    private static void dfs(int node, boolean[] visited, int[][] computers) {
        visited[node] = true;

        for (int i = 0; i < computers.length; i++) {
            if (visited[i] == false && computers[node][i] == 1) {
                dfs(i, visited, computers);
            }
        }
    }
}
