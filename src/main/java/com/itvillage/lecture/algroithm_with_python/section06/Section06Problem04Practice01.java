package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 합이 같은 부분 집합 Practice01
 */
public class Section06Problem04Practice01 {
    static int n;
    static int[] arr;
    static int total;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        total = Arrays.stream(arr).sum();
        dfs(0, 0);
    }

    private static void dfs(int level, int sum) {
        if (sum > total / 2) {
            return;
        }
        if (level == n) {
            if (total - sum == sum) {
                System.out.print("YES");
                System.exit(0);
            }
        } else {
            dfs(level + 1, sum + arr[level]);
            dfs(level + 1, sum);
        }
    }
}
