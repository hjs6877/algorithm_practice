package com.itvillage.book.this_is_coding_test.part2.chapter04.practice;

import java.util.Scanner;

public class Chapter04Example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        int x = 1;
        int y = 1;
        for (char c : str.toCharArray()) {
            if (c == 'L' && y - 1 > 0) {
                y--;
            } else if (c == 'R' && y + 1 < size) {
                y++;
            } else if (c == 'U' && x - 1 > 0) {
                x--;
            } else if (c == 'D' && x + 1 < size) {
                x++;
            }
        }

        System.out.print(x + " " + y);
    }
}
