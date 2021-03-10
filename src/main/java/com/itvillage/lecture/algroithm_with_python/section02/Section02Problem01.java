package com.itvillage.lecture.algroithm_with_python.section02;

import java.util.Scanner;

/**
 * K번째 약수 찾기
 */
public class Section02Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

            if(count == k) {
                System.out.print(i);
                break;
            }

        }

        if (count != k) {
            System.out.println(-1);
        }
    }
}
