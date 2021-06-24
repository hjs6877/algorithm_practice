package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4651 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] yut = new int[3][4];
        for (int i = 0; i < yut.length; i++) {
            for (int j = 0; j < yut[i].length; j++) {
                yut[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < yut.length; i++) {
            int count = 0;
            for (int j = 0; j < yut[i].length; j++) {
                if (yut[i][j] == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("A");
            } else if (count == 2) {
                System.out.println("B");
            } else if (count == 3) {
                System.out.println("C");
            } else if (count == 4) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }
    }
}
