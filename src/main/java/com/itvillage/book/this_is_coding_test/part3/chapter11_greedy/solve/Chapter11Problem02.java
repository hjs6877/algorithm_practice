package com.itvillage.book.this_is_coding_test.part3.chapter11_greedy.solve;

import java.util.Scanner;

/**
 * 곱하기 혹은 더하기
 */
public class Chapter11Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int sum = 0;
        for (char c : s.toCharArray()) {
            int num = Character.getNumericValue(c);
            if (num <= 1 || sum <= 1) {
                sum += num;
            } else {
                sum *= num;
            }
        }

        System.out.print(sum);
    }
}
