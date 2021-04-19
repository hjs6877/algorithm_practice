package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 조합 구하기
 */
public class Section06Problem10 {
    static int n, m;
    static int[] result;
    static int count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        result = new int[m];

        dfs(0, 1);
        System.out.print(count);
    }

    private static void dfs(int level, int s) {
        if (level == m) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            count++;
        } else {
            for (int i = s; i <= n; i++) {
                result[level] = i;
                dfs(level + 1, i + 1);
            }
        }
    }
}
