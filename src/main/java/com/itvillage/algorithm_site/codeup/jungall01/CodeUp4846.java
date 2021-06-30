package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4846 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] student = new int[n];
        int[] apple = new int[n];

        for (int i = 0; i < n; i++) {
            student[i] = scanner.nextInt();
            apple[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int remain = apple[i];
            while (remain >= student[i]) {
                remain = remain % student[i];
            }
            sum += remain;
        }

        System.out.print(sum);
    }
}
