package com.itvillage.algorithm_site.codeup.string;

import java.util.Scanner;

public class CodeUp1990 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        int sum = number.chars().sum();

        if (sum % 3 == 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
