package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4626 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        int sum = 0;
        for (int r : arr) {
            if (r == 0) {
                count = 0;
            } else if (r == 1) {
                if (count == 0) {
                    sum += 1;
                } else {
                    sum += 1 + count;
                }
                count++;
            }
        }

        System.out.print(sum);
    }
}
