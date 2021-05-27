package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 동전의 갯수 Practice01
 */
public class Section06Problem07Practice01 {
    static int n, m;
    static int min = Integer.MAX_VALUE;
    static int[] coins;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        coins = new int[n];

        for (int i = 0; i < coins.length; i++) {
            coins[i] = scanner.nextInt();
        }

        m = scanner.nextInt();

        dfs(0, 0);
        System.out.print(min);
    }

    private static void dfs(int level, int sum) {
        if (level >= min) {
            return;
        }

        if (sum > m) {
          return;
        } else if (sum == m) {
            min = Math.min(min, level);
        } else {
            for (int i = 0; i < coins.length; i++) {
                dfs(level + 1, sum + coins[i]);
            }
        }
    }
}
