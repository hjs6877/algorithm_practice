package com.itvillage.lecture.algroithm_with_python.section03;

import java.util.Scanner;

/**
 * 수들의 합
 */
public class Section03Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum == m) {
                count++;
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if(sum == m){
                    count++;
                    break;
                }
            }
        }

        System.out.print(count);
    }
}
