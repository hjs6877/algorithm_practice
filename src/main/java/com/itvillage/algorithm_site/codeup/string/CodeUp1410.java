package com.itvillage.algorithm_site.codeup.string;

import java.util.Scanner;

public class CodeUp1410 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] strs = str.split("");

        int open = 0, close = 0;

        for (String s : strs) {
            if(s.equals("(")) open++;
            if(s.equals(")")) close++;
        }

        System.out.printf("%s %s", open, close);
    }
}
