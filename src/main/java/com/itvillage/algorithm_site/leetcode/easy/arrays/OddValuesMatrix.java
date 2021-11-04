package com.itvillage.algorithm_site.leetcode.easy.arrays;

import java.util.Arrays;

public class OddValuesMatrix {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1}, {1, 1}};

        int result = oddCells(m, n, indices);

        System.out.println(result);
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int rIdx = indices[i][0];
            int cIdx = indices[i][1];

            for (int j = 0; j < n; j++) {
                matrix[rIdx][j]++;
            }

            for (int j = 0; j < m; j++) {
                matrix[j][cIdx]++;
            }
        }

        return (int) Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .filter(num -> num % 2 == 1)
                .count();
    }
}
