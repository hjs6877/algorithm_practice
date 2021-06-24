package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4771 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bowls = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < bowls.length(); i++) {
            if (i == 0) {
                sum += 10;
            } else {
                if (bowls.charAt(i) != bowls.charAt(i - 1)) {
                    sum += 10;
                } else {
                    sum += 5;
                }
            }
        }

        System.out.print(sum);
    }
}
