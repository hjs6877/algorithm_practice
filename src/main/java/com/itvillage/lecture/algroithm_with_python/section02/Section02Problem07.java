package com.itvillage.lecture.algroithm_with_python.section02;

import java.util.Scanner;

/**
 * 소수의 개수
 *  - 숫자만큼의 배열을 만들고, loop를 돌면서 해당 숫자의 배수들은 소수가 아니라고 1로 업데이트 하는게 핵심
 */
public class Section02Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                count++;
            }
            for (int j = i /** 2를 곱해줘도 되고 안해도 상관없음 */; j <= n; j += i /** i의 배수들만 loop를 돌게 해준다 */) {
                arr[j] = 1;
            }
        }

        System.out.print(count);
    }
}
