package com.itvillage.algorithm_site.leetcode.easy;

public class DetermineColorChessboard {
    public static void main(String[] args) {
        String coordinates = "a1";
        boolean result = squareIsWhite(coordinates);

        System.out.print(result);
    }

    public static boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0) - 'a' + 1;
        int row = coordinates.charAt(1) - '1' + 1;

        return (col + row) % 2 != 0;
    }
}
