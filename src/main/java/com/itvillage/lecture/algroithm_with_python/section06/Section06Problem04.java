package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.*;

/**
 * 합이 같은 부분 집합
 */
public class Section06Problem04 {
    static int n;
    static int[] nodes;
    static int total;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = scanner.nextInt();
        }
        total = Arrays.stream(nodes).sum();


        dfs(0, 0);

        System.out.print("NO");
    }

    private static void dfs(int idx, int sum) {
        if (sum > total / 2) {
            return;
        }
        if (idx == n) {
            if (sum == total - sum) {
                System.out.println("YES");
                System.exit(0);
            }
        } else {
            dfs(idx + 1, sum + nodes[idx]);
            dfs(idx + 1, sum);
        }
    }
}
