package com.itvillage.algorithm_site.codeup.suggest;

import java.util.Scanner;

public class CodeUp1286 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int n : arr) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }

        System.out.println(max);
        System.out.println(min);
    }
}
