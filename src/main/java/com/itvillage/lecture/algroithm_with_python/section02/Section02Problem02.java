package com.itvillage.lecture.algroithm_with_python.section02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * K 번째 수 찾기
 */
public class Section02Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            int e = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            int[] slice = Arrays.copyOfRange(arr, s - 1, e);

            Arrays.sort(slice);
            System.out.println(slice[k - 1]);
        }
    }
}
