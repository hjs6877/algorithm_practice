package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 중복 순열 Practice02
 */
public class Section06Problem06Practice01 {
    static int n, m;
    static int[] arr;
    static int count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[m];

        dfs(0);
        System.out.print(count);
    }

    private static void dfs(int level) {
        if (level == m) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            count++;
        } else {
            for (int i = 1; i <= n; i++) {
                arr[level] = i;
                dfs(level + 1);
            }
        }
    }
}
