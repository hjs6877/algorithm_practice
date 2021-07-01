package com.itvillage.algorithm_site.codeup.suggest;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = Arrays.stream(arr).sum();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.print(total - sum);
    }
}
