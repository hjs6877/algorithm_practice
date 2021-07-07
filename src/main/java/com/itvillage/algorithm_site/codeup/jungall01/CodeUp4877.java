package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = n / c; i >= 0; i--) {
            if(i * c > n) continue;
            for (int j = n / b; j >= 0; j--) {
                if((i * c) + (j * b) > n) continue;
                for (int k = n / a; k >= 0; k--) {
                    int sum = (i * c) + (j * b) + (k * a);
                    if(sum > n) continue;
                    if (sum == n) {
                        System.out.print(1);
                        System.exit(0);
                    }
                }
            }
        }

    }
}
