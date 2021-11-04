package com.itvillage.algorithm_site.leetcode.easy.arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] result = flipAndInvertImage(image);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] fiImage = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                fiImage[i][j] = image[i][image.length - 1 - j] ^ 1;
            }
        }

        return fiImage;
    }
}
