package com.itvillage.algorithm_site.codeup.string;

import java.util.Scanner;

public class CodeUp1295 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer sb = new StringBuffer();

        for (char s : str.toCharArray()) {
            if (Character.isLowerCase(s)) {
                sb.append(Character.toUpperCase(s));
            } else {
                sb.append(Character.toLowerCase(s));
            }
        }

        System.out.print(sb.toString());
    }
}
