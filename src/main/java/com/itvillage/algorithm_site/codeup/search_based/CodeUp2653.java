package com.itvillage.algorithm_site.codeup.search_based;

import java.util.Scanner;

public class CodeUp2653 {
    static int n;
    static int[] arr;
    static int result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        result = (int) Math.pow(2, n);
        dfs(0);
        System.out.print(result);
    }

    private static void dfs(int level) {
        if (level == n) {
            int count = 0;
            for (int num : arr) {
                count = num == 0 ? count + 1 : 0;

                if (count == 2) {
                    result--;
                    break;
                }
            }
        } else {
            arr[level] = 0;
            dfs(level + 1);

            arr[level] = 1;
            dfs(level + 1);
        }
    }
}
