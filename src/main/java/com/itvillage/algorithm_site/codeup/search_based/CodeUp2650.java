package com.itvillage.algorithm_site.codeup.search_based;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp2650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int gcd = gcd(arr[0], arr[1]);
        int result2 = gcd(arr[2], gcd);

        System.out.print(result2);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
