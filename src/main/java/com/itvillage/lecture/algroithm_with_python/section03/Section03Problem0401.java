package com.itvillage.lecture.algroithm_with_python.section03;

import java.util.Scanner;

/**
 * 리스트 합치기
 */
public class Section03Problem0401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] count = new int[100];
        for (int i = 0; i < n; i++) {
            count[arr1[i]]++;
        }

        for (int i = 0; i < m; i++) {
            count[arr2[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            for (int j = count[i]; j > 0; j--) {
                System.out.print(i + " ");
            }
        }
    }
}
