package com.itvillage.algorithm_site.leetcode.easy.arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int result = diagonalSum(mat);

        System.out.println(result);
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];

            if (mat.length % 2 == 1 && i == (mat.length - 1) / 2) continue;
            sum += mat[i][mat.length - 1 - i];
        }

        return sum;
    }
}
