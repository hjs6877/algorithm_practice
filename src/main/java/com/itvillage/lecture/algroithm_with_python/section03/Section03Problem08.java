package com.itvillage.lecture.algroithm_with_python.section03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 곶감(모래시계)
 */
public class Section03Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nArr[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[][] mArr = new int[m][3];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < mArr[i].length; j++) {
                mArr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            int[] row = nArr[mArr[i][0] - 1];
            int d = mArr[i][1];
            int mv = mArr[i][2];
            int[] arr = Arrays.copyOf(row, row.length);
            for (int j = 0; j < arr.length; j++) {
                int mIdx = -1;
                // 왼쪽으로 회전
                if (d == 0) {
                    if (j - mv < 0) {
                        mIdx = arr.length - (mv - j);
                    } else {
                        mIdx = j - mv;
                    }
                } else if(d == 1) { // 오른쪽으로 회전
                    mIdx = (j + mv) % row.length;
                }
                nArr[mArr[i][0] - 1][mIdx] = arr[j];
            }
        }

        int s = 0;
        int e = n - 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = s; j <= e; j++) {
                sum += nArr[i][j];
            }
            if (i < n / 2) {
                s++;
                e--;
            } else {
                s--;
                e++;
            }
        }

        System.out.print(sum);
    }
}
