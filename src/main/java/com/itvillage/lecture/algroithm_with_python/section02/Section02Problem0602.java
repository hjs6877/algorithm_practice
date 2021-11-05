package com.itvillage.lecture.algroithm_with_python.section02;

import java.util.Scanner;

/**
 * 자릿수의 합
 */
public class Section02Problem0602 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = -1;
        int maxNum = -1;
        for (int num : arr) {
            int sum = digitSum(num);

            if (max != sum && max < sum) {
                max = sum;
                maxNum = num;
            }
        }

        System.out.println(maxNum);
    }

    public static int digitSum(int num) {

        int sum = 0;

        // 자릿수를 더하기 위해서는 10으로 나눈 몫과 나머지를 이용한다.
        while (num > 0) {
            int q = num / 10;
            int r = num % 10;
            sum += r;
            num = q;
        }


        return sum;
    }

}
