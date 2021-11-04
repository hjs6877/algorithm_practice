package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 순열 구하기
 */
public class Section06Problem08 {
    static int[] values;
    static int n, m;
    static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        values = new int[m];

        dfs(0, 0);
        System.out.println(count);
    }

    private static void dfs(int level, int selected) {
        if (level == m) {
            for (int i = 0; i < values.length; i++) {
                System.out.print(values[i] + " ");
            }
            count++;
            System.out.println();
            return;
        } else {
            for (int i = 1; i <= n; i++) {
                if (selected == i) {
                    continue;
                }
                values[level] = i;
                dfs(level + 1, i);
            }
        }
    }
}
