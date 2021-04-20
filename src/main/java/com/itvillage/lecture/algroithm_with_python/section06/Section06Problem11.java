package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 수들의 조합
 */
public class Section06Problem11 {
    static int n, k, m;
    static int[] arr;
    static int result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        m = scanner.nextInt();

        dfs(0, 0, 0);

        System.out.print(result);
    }

    private static void dfs(int level, int s, int sum) {
        if (level == k) {
            if (sum % m == 0) {
                result++;
            }
        } else {
            for (int i = s; i < n; i++) {
                dfs(level + 1, i + 1, sum + arr[i]);
            }
        }
    }
}
