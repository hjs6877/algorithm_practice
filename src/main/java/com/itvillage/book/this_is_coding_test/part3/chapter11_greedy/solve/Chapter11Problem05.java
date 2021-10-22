package com.itvillage.book.this_is_coding_test.part3.chapter11_greedy.solve;

import java.util.Scanner;

/**
 * 볼링공 고르기
 *  - 특정 점수의 볼링공 개수 x 나머지 볼링공 개수 = 경우의 수
 *  - 이미 뽑은 특정 점수의 볼링공 개수(n)는 전체 볼링공 개수에서 제외한다.
 */
public class Chapter11Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] cnt = new int[11];
        for (int i = 0; i < arr.length; i++) {
            cnt[arr[i]]++;
        }

        int result = 0;
        for (int i = 1; i <= m; i++) {
            n -= cnt[i];
            result += n * cnt[i];
        }

        System.out.print(result);
    }
}
