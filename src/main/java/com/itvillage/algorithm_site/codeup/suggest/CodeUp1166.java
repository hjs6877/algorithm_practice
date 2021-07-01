package com.itvillage.algorithm_site.codeup.suggest;

import java.util.Scanner;

public class CodeUp1166 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
