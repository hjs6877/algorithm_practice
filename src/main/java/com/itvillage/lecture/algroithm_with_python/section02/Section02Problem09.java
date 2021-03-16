package com.itvillage.lecture.algroithm_with_python.section02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 주사위 게임
 */
public class Section02Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxPrice = -1;
        for (int i = 0; i < n; i++) {
            int[] arr = new int[3];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
            }

            int price = 0;
            if (arr[0] == arr[1] && arr[0] == arr[2]) {
                price = 10000 + (arr[0] * 1000);
            } else if (arr[0] == arr[1] || arr[0] == arr[2]) {
                price = 1000 + (arr[0] * 100);
            } else if (arr[1] == arr[2]) {
                price = 1000 + (arr[1] * 100);
            } else {
                Arrays.sort(arr);
                price = arr[2] * 100;
            }

            maxPrice = Math.max(maxPrice, price);
        }

        System.out.print(maxPrice);
    }
}
