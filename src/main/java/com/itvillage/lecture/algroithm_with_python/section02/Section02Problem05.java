package com.itvillage.lecture.algroithm_with_python.section02;

import java.util.*;

/**
 * 정다면체
 */
public class Section02Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] counts = new int[n + m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                counts[i + j]++;
            }
        }
        int max = Arrays.stream(counts).max().getAsInt();

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}
