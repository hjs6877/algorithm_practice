package com.itvillage.algorithm_site.codeup.stack;

import java.util.Scanner;

public class CodeUp1402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = scanner.nextInt();
        int[] arr = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            arr[i] = scanner.nextInt();
        }

        reversePrint(arr);
    }

    private static void reversePrint(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
