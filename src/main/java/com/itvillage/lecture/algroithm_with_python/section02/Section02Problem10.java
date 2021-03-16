package com.itvillage.lecture.algroithm_with_python.section02;

import java.util.Scanner;

/**
 * 점수 계산
 */
public class Section02Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int s = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sum += ++s;
            } else {
                s = 0;
            }
        }

        System.out.print(sum);
    }
}
