package com.itvillage.book.this_is_coding_test.part2.chapter03_greedy.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter03Problem02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;
        int limit = 0;
        int sum = 0;
        while (count < m) {
            if (limit == k) {
                sum += arr[arr.length - 2];
                limit = 0;
            } else {
                sum += arr[arr.length - 1];
                limit++;
            }
            count++;
        }

        System.out.print(sum);
    }
}
