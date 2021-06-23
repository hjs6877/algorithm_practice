package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("2 " + Integer.toBinaryString(n));
        System.out.println("8 " + Integer.toOctalString(n));
        System.out.println("16 " + Integer.toHexString(n).toUpperCase());
    }
}
