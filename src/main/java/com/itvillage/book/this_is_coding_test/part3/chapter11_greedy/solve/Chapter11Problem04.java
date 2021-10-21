package com.itvillage.book.this_is_coding_test.part3.chapter11_greedy.solve;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 만들 수 없는 금액
 * - 해결은 했지만 성능이 별로 안좋은 알고리즘임.
 */
public class Chapter11Problem04 {
    static int max;
    static int[] exists;
    static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int num : arr) {
            max += num;
        }

        Arrays.sort(arr);
        exists = new int[max + 1];

        dfs(0, 0);

        for (int i = 1; i < exists.length; i++) {
            if (exists[i] == 0) {
                System.out.print(i);
                break;
            }
        }
    }

    private static void dfs(int level, int sum) {
        if (level == arr.length) {
            exists[sum] = 1;
        } else {
            dfs(level + 1, sum + arr[level]);
            dfs(level + 1, sum);
        }
    }
}
