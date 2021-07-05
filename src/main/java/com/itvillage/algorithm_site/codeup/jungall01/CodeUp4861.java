package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4861 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] genders = new int[n];
        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            genders[i] = scanner.nextInt();
            grades[i] = scanner.nextInt();
        }

        int[] fCnt = new int[6 + 1];
        int[] mCnt = new int[6 + 1];


        for (int i = 0; i < n; i++) {
            if (genders[i] == 0) {
                fCnt[grades[i]]++;
            } else {
                mCnt[grades[i]]++;
            }
        }

        int totalRoom = 0;
        for (int i = 1; i < fCnt.length; i++) {
            totalRoom += fCnt[i] / k;
            if (fCnt[i] % k != 0) {
                totalRoom++;
            }

            totalRoom += mCnt[i] / k;
            if (mCnt[i] % k != 0) {
                totalRoom++;
            }
        }

        System.out.print(totalRoom);
    }
}
