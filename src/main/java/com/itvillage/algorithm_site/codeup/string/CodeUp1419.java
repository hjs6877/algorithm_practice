package com.itvillage.algorithm_site.codeup.string;

import java.util.Scanner;

public class CodeUp1419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start = 0;
        int count = 0;
        int idx;
        while ((idx = sentence.indexOf("love", start)) != -1) {
            count++;
            start = idx + 4;
        }
        System.out.print(count);
    }
}
