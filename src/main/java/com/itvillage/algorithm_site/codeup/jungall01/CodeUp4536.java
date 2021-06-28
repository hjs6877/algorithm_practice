package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp4536 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max + 1];
        for (int n : arr) {
            count[n]++;
        }

        int often = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > often) {
                often = count[i];
                idx = i;
            }
        }
        int avg = (int) Arrays.stream(arr).average().getAsDouble();

        System.out.println(avg);
        System.out.print(idx);
    }
}
