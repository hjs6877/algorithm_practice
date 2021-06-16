package com.itvillage.algorithm_site.codeup.stack;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp3021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());
        BigInteger c = a.add(b);
        System.out.println(c.toString());
    }
}
