package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp4561 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = Arrays.stream(arr).filter(n -> n % 2 == 1).sum();
        if (sum == 0) {
            System.out.print(-1);
        } else {
            int min = Arrays.stream(arr).filter(n -> n % 2 == 1).min().getAsInt();
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
