package com.itvillage.book.this_is_coding_test.part3.chapter11_greedy.solve;

import java.util.Scanner;

public class Chapter11Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int sum = 0;
        for (char c : s.toCharArray()) {
            int num = Character.getNumericValue(c);
            if (num == 0 || num == 1) {
                sum = sum + num;
            } else {
                if (sum == 0) {
                    sum += 1;
                }
                sum = sum * num;
            }
        }

        System.out.print(sum);
    }
}
