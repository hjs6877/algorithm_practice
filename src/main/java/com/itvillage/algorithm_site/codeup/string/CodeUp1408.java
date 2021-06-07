package com.itvillage.algorithm_site.codeup.string;

import java.util.Scanner;
import java.util.function.Function;

public class CodeUp1408 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        convert(str, ch -> (char) (ch + 2));
        System.out.println();
        convert(str, ch -> (char) ((ch * 7) % 80 + 48));
    }

    private static void convert(String str, Function<Integer, Character> f) {
        for (int ch : str.toCharArray()) {
            char password = f.apply(ch);
            System.out.print(password);
        }
    }
}
