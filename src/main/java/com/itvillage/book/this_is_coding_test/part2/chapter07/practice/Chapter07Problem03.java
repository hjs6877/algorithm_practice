package com.itvillage.book.this_is_coding_test.part2.chapter07.practice;

import java.util.Scanner;

public class Chapter07Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > end) {
                end = arr[i];
            }
        }

        int result = 0;
        while (start <= end) {
            int total = 0;
            int mid = (start + end) / 2;

            for (int length : arr) {
                if (length > mid) {
                    total += length - mid;
                }
            }

            if (total > m) {
                start = mid +1;
            } else {
                end = mid - 1;
            }
            result = mid;
        }

        System.out.print(result);
    }
}
