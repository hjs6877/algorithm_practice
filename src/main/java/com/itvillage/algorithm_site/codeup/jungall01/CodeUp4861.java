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

        int cnt12 = 0;
        int fCnt34 = 0;
        int mCnt34 = 0;
        int fCnt56 = 0;
        int mCnt56 = 0;


        for (int i = 0; i < n; i++) {
            if (grades[i] == 1 || grades[i] == 2) {
                cnt12++;
            } else if ((grades[i] == 3 || grades[i] == 4) && genders[i] == 0) {
                fCnt34++;
            } else if ((grades[i] == 3 || grades[i] == 4) && genders[i] == 1) {
                mCnt34++;
            } else if ((grades[i] == 5 || grades[i] == 6) && genders[i] == 0) {
                fCnt56++;
            } else if ((grades[i] == 5 || grades[i] == 6) && genders[i] == 1) {
                mCnt56++;
            }
        }

        int totalRoom = 0;
        totalRoom += cnt12 / k;
        totalRoom += fCnt34 / k;
        totalRoom += mCnt34 / k;
        totalRoom += fCnt56 / k;
        totalRoom += mCnt56 / k;

        if (cnt12 % k != 0) totalRoom++;
        if (fCnt34 % k != 0) totalRoom++;
        if (mCnt34 % k != 0) totalRoom++;
        if (fCnt56 % k != 0) totalRoom++;
        if (mCnt56 % k != 0) totalRoom++;

        System.out.print(totalRoom);
    }
}
