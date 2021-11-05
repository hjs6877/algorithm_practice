package com.itvillage.lecture.algroithm_with_python.section02;

import java.util.Scanner;

/**
 * 소수의 개수
 * - 숫자만큼의 배열을 만들고, loop를 돌면서 해당 숫자의 배수들은 소수가 아니라고 1로 업데이트 하는게 핵심
 */
public class Section02Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 0;
        int[] arr = new int[n + 1]; // 마지막 n 까지 확인해야 하므로 1을 더해준다.

        // TODO 알고리즘 다시 구현 필요

        System.out.print(count);
    }
}
