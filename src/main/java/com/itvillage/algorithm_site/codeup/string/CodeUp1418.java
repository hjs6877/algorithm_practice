package com.itvillage.algorithm_site.codeup.string;

import java.util.Scanner;

public class CodeUp1418 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 't') {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
