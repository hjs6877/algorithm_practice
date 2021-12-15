package com.itvillage.book.this_is_coding_test.part2.chapter04.solve;

import java.util.Scanner;

public class Chapter04Example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String p = scanner.nextLine();
        char[] plans = p.toCharArray();

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int[] types = {'L', 'R', 'U', 'D'};
        int x = 1;
        int y = 1;

        for (int i = 0; i < plans.length; i++) {
            int nx = 0, ny = 0;
            for (int j = 0; j < types.length; j++) {
                if (plans[i] == types[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }

            if (nx < 1 || nx > n || ny < 1 || ny > n) {
                continue;
            }

            x = nx;
            y = ny;
        }

        System.out.print(x + " " + y);
    }
}
