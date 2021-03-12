package com.itvillage.lecture.algroithm_with_python.section02;

import java.util.Scanner;

/**
 * 자릿수의 합
 */
public class Section02Problem0601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = 0;
        int maxNum = -1;
        for (int num : arr) {
            String str = String.valueOf(num);
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += Character.getNumericValue(str.charAt(i));
            }

            if (max != sum && max < sum) {
                max = sum;
                maxNum = num;
            }
        }

        System.out.println(maxNum);
    }
}
