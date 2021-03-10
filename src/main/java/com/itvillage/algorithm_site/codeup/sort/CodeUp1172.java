package com.itvillage.algorithm_site.codeup.sort;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1172 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
