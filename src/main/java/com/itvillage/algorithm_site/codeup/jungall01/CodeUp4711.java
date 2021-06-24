package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4711 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ins = new int[4];
        int[] outs = new int[4];

        for (int i = 0; i < 4; i++) {
            outs[i] = scanner.nextInt();
            ins[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int curPeople = 0;
        for (int i = 0; i < 4; i++) {
            int out = outs[i];
            int in = ins[i];
            curPeople = curPeople + (in - out);
            max = Math.max(max, curPeople);
        }

        System.out.print(max);
    }
}
