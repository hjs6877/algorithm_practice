package com.itvillage.book.this_is_coding_test.part2.chapter03_greedy.solve;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Chapter03Problem02 {
    private static int n, m, k;
    private static int sum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열의 크기
        n = scanner.nextInt();

        // m번 더할 수 있다.
        m = scanner.nextInt();

        // 동일 인덱스의 수가 k번을 초과해서 더해질 수 없음.
        k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int count = (m / k) * k;
        sum += arr[n - 1] * count;
        sum += arr[n - 2] * (m - count);

        System.out.println(sum);
    }
}
