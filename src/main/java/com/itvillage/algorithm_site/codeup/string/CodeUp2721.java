package com.itvillage.algorithm_site.codeup.string;

import java.util.Scanner;

public class CodeUp2721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        if (s1.substring(s1.length() - 1).equals(s2.substring(0, 1))
                && s2.substring(s2.length() - 1).equals(s3.substring(0, 1))
                && s3.substring(s3.length() - 1).equals(s1.substring(0, 1))) {
            System.out.print("good");
        } else {
            System.out.print("bad");
        }
    }
}
