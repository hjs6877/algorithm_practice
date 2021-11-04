package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 조합 구하기 Practice01
 */
public class Section06Problem10Practice01 {
    static int n, m, count;
    static int[] values;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        values = new int[m];
        dfs(0, 1);
        System.out.print(count);
    }

    private static void dfs(int level, int s) {
        if (level == m) {
            for (int val : values) {
                System.out.print(val + " ");
            }
            count++;
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                values[level] = i;
                dfs(level + 1, i + 1);
            }
        }
    }
}
