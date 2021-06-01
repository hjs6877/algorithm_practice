package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 순열 구하기
 */
public class Section06Problem08Practice01 {
    static int m, n, count;
    static int[] values;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        values = new int[m];

        dfs(0, 0);
        System.out.print(count);
    }

    private static void dfs(int level, int selected) {
        if (level == m) {
            for (int val : values) {
                System.out.print(val + " ");
            }
            count++;
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                if(i == selected) continue;
                values[level] = i;
                dfs(level + 1, i);
            }
        }
    }
}
