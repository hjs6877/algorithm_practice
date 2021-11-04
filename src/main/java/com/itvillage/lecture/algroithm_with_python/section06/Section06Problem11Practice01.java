package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 수들의 조합 Practice01
 */
public class Section06Problem11Practice01 {
    static int n, k, m, count;
    static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        m = scanner.nextInt();

        dfs(0, 0, 0);
        System.out.print(count);
    }

    private static void dfs(int level, int start, int sum) {
        if (level == k) {
            if (sum % m == 0) count++;
        } else {
            for (int i = start; i < n; i++) {
                dfs(level + 1, i + 1, sum + arr[i]);
            }
        }
    }
}
