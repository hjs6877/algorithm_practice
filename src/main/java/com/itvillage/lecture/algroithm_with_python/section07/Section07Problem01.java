package com.itvillage.lecture.algroithm_with_python.section07;

import java.util.Scanner;

/**
 * 최대 점수 구하기(DFS)
 */
public class Section07Problem01 {
    static int n, m;
    static int[][] arr;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n][2];

        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        dfs(0, 0, 0);
        System.out.print(max);
    }

    private static void dfs(int level, int sum, int time) {
        if (time > m) {
            return;
        }

        if (level == n) {
            // 최댓값을 판단한다.
            max = Math.max(max, sum);
        } else {
            dfs(level + 1, sum + arr[level][0], time + arr[level][1]);
            dfs(level + 1, sum, time);
        }
    }
}
