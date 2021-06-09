package com.itvillage.algorithm_site.codeup.string;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1754 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger one = new BigInteger(scanner.next());
        BigInteger two = new BigInteger(scanner.next());

        if (one.compareTo(two) == 1) {
            System.out.printf("%s %s", two.toString(), one.toString());
        } else {
            System.out.printf("%s %s", one.toString(), two.toString());
        }
    }
}
