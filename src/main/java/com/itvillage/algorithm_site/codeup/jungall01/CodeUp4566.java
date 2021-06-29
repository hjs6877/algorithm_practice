package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeUp4566 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        List<Integer> primeList = new ArrayList<>();

        for (int i = m; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 1; j <= i; j++) {
                if (i == 1 || (j != 1 && i != j && i % j == 0)) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeList.add(i);
            }
        }

        int sum = primeList.stream().mapToInt(i -> i).sum();
        int min = primeList.stream().mapToInt(i -> i).min().getAsInt();

        System.out.println(sum);
        System.out.println(min);
    }
}
