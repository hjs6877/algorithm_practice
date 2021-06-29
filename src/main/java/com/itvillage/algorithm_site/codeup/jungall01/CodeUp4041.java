package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer sb = new StringBuffer();

        sb.append(str).reverse();

        while (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        int sum = sb.chars().map(Character::getNumericValue).sum();

        System.out.println(sb.toString());
        System.out.println(sum);
    }
}
