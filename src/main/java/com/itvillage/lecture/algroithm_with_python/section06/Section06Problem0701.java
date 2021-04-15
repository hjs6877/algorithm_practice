package com.itvillage.lecture.algroithm_with_python.section06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 동전 교환
 */
public class Section06Problem0701 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] coins = new Integer[n];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        Arrays.sort(coins, Collections.reverseOrder());
        int count = 0;

        for (int i = 0; i < coins.length; i++) {
            int q = m / coins[i];
            int r = m % coins[i];
            count += q;

            if (r == 0) {
                break;
            } else {
                m = r;
            }
        }

        System.out.print(count);
    }
}
