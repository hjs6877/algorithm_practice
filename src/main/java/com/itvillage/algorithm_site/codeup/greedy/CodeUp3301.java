package com.itvillage.algorithm_site.codeup.greedy;

import java.util.Scanner;

public class CodeUp3301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int count = 0;

        for (int x : arr) {
            count += n / x;
            n = n % x;
        }

        System.out.print(count);
    }

}
