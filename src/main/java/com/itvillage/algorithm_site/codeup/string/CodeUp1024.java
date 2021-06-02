package com.itvillage.algorithm_site.codeup.string;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.println("'" + word.charAt(i) + "'");
        }
    }
}
