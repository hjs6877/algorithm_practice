package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp4681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = Arrays.stream(arr).map(n -> n * n).sum() % 10;
        System.out.print(result);
    }
}
