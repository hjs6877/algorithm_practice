package com.itvillage.lecture.algroithm_with_python.section07;

import java.util.Scanner;

/**
 * 동전 바꿔주기
 */
public class Section07Problem04 {
    static int k, t;
    static int[] coinTypes;
    static int[] coinsAmount;
    static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        k = scanner.nextInt();
        coinTypes = new int[k];
        coinsAmount = new int[k];
        for (int i = 0; i < k; i++) {
            coinTypes[i] = scanner.nextInt();
            coinsAmount[i] = scanner.nextInt();
        }

        dfs(0, 0);
        System.out.print(count);
    }

    private static void dfs(int level, int sum) {
        if (level == k) {
            if (sum == t) {
                count++;
            }
        } else {
            for (int i = 0; i <= coinsAmount[level]; i++) {
                dfs(level + 1, sum + (coinTypes[level] * i));
            }
        }
    }
}
