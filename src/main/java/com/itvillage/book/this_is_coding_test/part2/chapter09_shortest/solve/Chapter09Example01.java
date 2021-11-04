package com.itvillage.book.this_is_coding_test.part2.chapter09_shortest.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Chapter09Example01 {
    private static List<List<Node>> graph = new ArrayList<>();
    private static int[] d = new int[100001];
    private static boolean[] visited = new boolean[100001];
    private static int n, m, start;
    private final static int INF = (int) 1e9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        start = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            graph.get(a).add(new Node(b, c));
        }

        Arrays.fill(d, INF);

        dijkstra(start);

        for (int i = 1; i <= n; i++) {
            if (d[i] == INF) {
                System.out.println("INFINITY");
            } else {
                System.out.println(d[i]);
            }
        }
    }

    // 방문하지 않은 노드 중에 거리가 가장 짧은 노드의 index 구하기
    public static int getShortestNode() {
        int min = INF;
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && d[i] < min) {
                min = d[i];
                index = i;
            }
        }
        return index;
    }

    // 최단거리 테이블 업데이트
    public static void dijkstra(int start) {
        d[start] = 0;

        for (int i = 0; i < n; i++) {
            int now = getShortestNode();
            visited[now] = true;
            for (int j = 0; j < graph.get(now).size(); j++) {
                int cost = d[now] + graph.get(now).get(j).getDistance();
                if (cost < d[graph.get(now).get(j).getIndex()]) {
                    d[graph.get(now).get(j).getIndex()] = cost;
                }
            }
        }
    }

}

