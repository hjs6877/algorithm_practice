package com.itvillage.algorithm_site.codeup.string;

import java.util.Scanner;

public class CodeUp1414 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chs = str.toCharArray();
        int c = 0, cc = 0;
        for (int i = 0; i < chs.length; i++) {
            if (Character.toUpperCase(chs[i]) == 'C') {
                c++;
            }

            if (i < chs.length - 1 && Character.toUpperCase(chs[i]) == 'C' && Character.toUpperCase(chs[i + 1]) == 'C') {
                cc++;
            }
        }

        System.out.println(c);
        System.out.println(cc);
    }
}
