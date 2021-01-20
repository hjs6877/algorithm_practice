package com.itvillage.book.this_is_coding_test.part2.chapter06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Chapter06Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            a[i] = num;
        }

        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            b[i] = num;
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            if (a[i] < b[i]) {
                a[i] = b[i];
            } else {
                break;
            }
        }

        int sum = 0;

        for (int num : a) {
            sum += num;
        }

        System.out.println(sum);
    }
}
