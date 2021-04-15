package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 동전 교환
 */
public class Section06Problem0702 {
    static int n;
    static Integer[] coins;
    static int count = Integer.MAX_VALUE;
    static int m;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        coins = new Integer[n];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = scanner.nextInt();
        }
        m = scanner.nextInt();
        Arrays.sort(coins, Collections.reverseOrder());

        dfs(0, 0);
        System.out.print(count);
    }

    private static void dfs(int level, int sum) {
        if (level >= count) {
            return;
        }
        if (sum > m) {
            return;
        } else if (sum == m) {
            count = Math.min(level, count);
        } else {
            for (int i = 0; i < n; i++) {
                dfs(level + 1, sum + coins[i]);
            }
        }
    }
}
