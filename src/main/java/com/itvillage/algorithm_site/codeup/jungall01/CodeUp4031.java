package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp4031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxOdd = Arrays.stream(arr).filter(n -> n % 2 == 1).max().orElse(0);
        int maxEven = Arrays.stream(arr).filter(n -> n % 2 == 0).max().orElse(0);

        System.out.print(maxOdd + maxEven);
    }
}
