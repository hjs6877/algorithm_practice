package com.itvillage.algorithm_site.codeup.suggest;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp2608 {
    static int n;
    static String[] votes;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        votes = new String[n];

        dfs(0);
    }

    private static void dfs(int level) {
        if (level == n) {
            System.out.println(Arrays.stream(votes).reduce((a, b) -> a + b).get());
        } else {
            votes[level] = "O";
            dfs(level + 1);
            votes[level] = "X";
            dfs(level + 1);
        }
    }
}
