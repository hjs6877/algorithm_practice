package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp4531 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int avg = (int) Arrays.stream(arr).average().getAsDouble();
        int mid = arr[2];

        System.out.println(avg);
        System.out.print(mid);
    }
}
