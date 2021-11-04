package com.itvillage.lecture.algroithm_with_python.section03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 카드 역배치
 * - 배열을 copy 해서 역배치 하는 방법
 */
public class Section03Problem0301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[][] sectors = new int[10][2];
        for (int i = 0; i < sectors.length; i++) {
            for (int j = 0; j < sectors[i].length; j++) {
                sectors[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < sectors.length; i++) {
            int[] sector = sectors[i];
            int start = sector[0] - 1;
            int end = sector[1] - 1;
            int[] copy = Arrays.copyOfRange(arr, start, end + 1);
            int k = copy.length - 1;

            for (int j = start; j <= end; j++) {
                arr[j] = copy[k--];
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
