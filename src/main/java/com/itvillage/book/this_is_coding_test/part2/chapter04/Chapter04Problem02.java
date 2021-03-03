package com.itvillage.book.this_is_coding_test.part2.chapter04;

import java.util.Scanner;

public class  Chapter04Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pos = scanner.nextLine();
        int col = pos.charAt(0) - 'a' + 1;
        int row = Character.getNumericValue(pos.charAt(1));

        int[][] directions = {{-2, -1}, {-2, 1}, {2, -1}, {2, 1}, {-1, -2}, {1, -2}, {-1, 2}, {1, 2}};

        int count = 0;
        for (int[] direction : directions) {
            int nextRow = row + direction[0];
            int nextCol = col + direction[1];

            if (nextRow >= 1 && nextRow <= 8 && nextCol >= 1 && nextRow <= 8) {
                count++;
            }
        }

        System.out.println(count);
    }
}
