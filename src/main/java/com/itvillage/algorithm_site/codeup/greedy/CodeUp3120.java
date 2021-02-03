package com.itvillage.algorithm_site.codeup.greedy;

import java.util.Scanner;

public class CodeUp3120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int now = sc.nextInt();
        int target = sc.nextInt();

        int result = 0;
        result += Math.abs(target - now) / 10;

        int x = Math.abs(target - now) % 10;

        if (x == 1 || x == 5) {
            result += 1;
        }

        if (x == 2 || x == 4 || x == 6 || x == 9) {
            result += 2;
        }

        if (x == 3 || x == 7 || x == 8) {
            result += 3;
        }

        System.out.print(result);
    }
}
