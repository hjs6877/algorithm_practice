package com.itvillage.lecture.algroithm_with_python.section07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 동전 분배하기(DFS)
 */
public class Section07Problem05 {
    static int n;
    static int[] money, coins;
    static int diff;
    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }

        money = new int[3];

        dfs(0);
        System.out.print(result);
    }

    private static void dfs(int level) {
        if (level == n) {
            Set<Integer> set = new HashSet<>();
            for (int m : money) {
                set.add(m);
            }
            if (set.size() == 3) {
                diff = Arrays.stream(money).max().getAsInt() - Arrays.stream(money).min().getAsInt();
                result = Math.min(diff, result);
            } else {
                return;
            }
        } else {
            for (int i = 0; i < 3; i++) {
                money[i] += coins[level];
                dfs(level + 1);
                money[i] -= coins[level];
            }
        }
    }
}
