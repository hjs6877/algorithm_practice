package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 중복 순열 구하기
 */
public class Section07Problem06 {
    public static int n, m;
    public static int[] values;
    public static int count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        values = new int[m];

        dfs(0);
        System.out.print(count);
    }

    private static void dfs(int level) {
        if (level == m) {
            for (int i = 0; i < values.length; i++) {
                System.out.print(values[i] + " ");
            }
            count++;
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                values[level] = i;
                dfs(level + 1);
            }
        }
    }
}
