package com.itvillage.algorithm_site.codeup.recursive;
import java.util.Scanner;

public class CodeUp1920 {
    static StringBuffer b = new StringBuffer();
    static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        convert(n, 2);
    }

    private static void convert(int m, int r) {
        if (m == 0 && r == 0) {
            System.out.print(n);
            return;
        }

        if (m == 0 && r == 1) {
            System.out.print(b.reverse());
        } else {
            int mod = m / 2;
            int remain = m % 2;
            b.append(remain);
            convert(mod, remain);
        }
    }
}
