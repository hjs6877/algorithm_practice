package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nums = new int[9][9];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];
                    row = i;
                    col = j;
                }
                max = Math.max(max, nums[i][j]);
            }
        }

        System.out.println(max);
        System.out.printf("%d %d", row + 1, col + 1);
    }
}
