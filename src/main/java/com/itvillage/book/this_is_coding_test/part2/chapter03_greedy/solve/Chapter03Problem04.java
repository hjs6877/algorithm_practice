package com.itvillage.book.this_is_coding_test.part2.chapter03_greedy.solve;

import java.util.Scanner;

public class Chapter03Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int count = 0;
        while (n != 1) {
            if (n % k == 0) {
                n /= k;
            } else {
                n -= 1;
            }
            count++;
        }

        System.out.print(count);
    }
}
