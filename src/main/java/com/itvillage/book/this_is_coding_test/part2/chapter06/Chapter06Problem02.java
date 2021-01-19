package com.itvillage.book.this_is_coding_test.part2.chapter06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Chapter06Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();
        Integer[] arr = new Integer[nums];
        for (int i = 0; i < nums; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
