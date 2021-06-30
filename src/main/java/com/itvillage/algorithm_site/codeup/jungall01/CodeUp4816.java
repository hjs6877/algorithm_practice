package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp4816 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int s300Mod = n / 300;
        int s300Remain = n % 300;
        int s60Mod = s300Remain / 60;
        int s60Remain = s300Remain % 60;
        int s10Mod = s60Remain / 10;
        int s10Remain = s60Remain % 10;

        if (s10Remain != 0) {
            System.out.print(-1);
        } else {
            System.out.printf("%d %d %d", s300Mod, s60Mod, s10Mod);
        }
    }
}
