package com.itvillage.book.this_is_coding_test.part2.chapter07.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter07Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] parts = new int[n];
        for (int i = 0; i < n; i++) {
            parts[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] rParts = new int[m];
        for (int i = 0; i < m; i++) {
            rParts[i] = scanner.nextInt();
        }

        Arrays.sort(parts);

        for (int i = 0; i < rParts.length; i++) {
            System.out.print(binarySearch(parts, rParts[i]) + " ");
        }
    }

    private static String binarySearch(int[] parts, int req) {
        int start = 0;
        int end = parts.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (req > parts[mid]) {
                start = mid + 1;
            } else if (req < parts[mid]) {
                end = mid - 1;
            } else {
                return "yes";
            }
            mid = (start + end) / 2;
        }
        return "no";
    }
}
