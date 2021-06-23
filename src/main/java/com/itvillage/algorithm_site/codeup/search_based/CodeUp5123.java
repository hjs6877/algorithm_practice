package com.itvillage.algorithm_site.codeup.search_based;

import java.util.Scanner;

public class CodeUp5123 {
    static int n;
    static int[] arr;
    static int result;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        dfs(0, 0, 0);
        System.out.print(result);
    }

    private static void dfs(int level, int start, int sum) {
        if (level == 2) {
            if (sum % 3 == 0) {
                result++;
            }
        } else {
            for (int i = start; i < n; i++) {
                dfs(level + 1, i + 1, sum + arr[i]);
            }
        }
    }
}
