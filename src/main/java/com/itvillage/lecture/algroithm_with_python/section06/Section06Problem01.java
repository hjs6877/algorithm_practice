package com.itvillage.lecture.algroithm_with_python.section06;

import java.util.Scanner;

/**
 * 재귀 함수를 이용한 이진수 출력
 */
public class Section06Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        binaryNumber(n);
    }

    private static void binaryNumber(int n) {
        if (n == 0) return;

        int q = n / 2;
        binaryNumber(q);

        int r = n % 2;
        System.out.print(r);
    }
}
