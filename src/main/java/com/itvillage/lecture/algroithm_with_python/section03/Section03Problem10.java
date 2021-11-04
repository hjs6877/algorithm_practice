package com.itvillage.lecture.algroithm_with_python.section03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 스도쿠 검사
 */
public class Section03Problem10 {
    public static int[] count = new int[10];
    public static boolean isRight = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }


        isRight = isRight(arr, 9, "row");

        if (isRight) {
            isRight = isRight(arr, 9, "col");
        }
        int n = 3;

        while (isRight && n <= 9) {
            Arrays.fill(count, 0);
            isRight = isRight(arr, n, "row");
            if (!isRight) {
                break;
            }
            n += 3;
        }

        if (isRight) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    private static boolean isRight(int[][] arr, int n, String type) {
        for (int i = 0; i < n; i++) {
            Arrays.fill(count, 0);
            for (int j = 0; j < n; j++) {
                int idx = arr[i][j];
                if (type.equals("col")) {
                    idx = arr[j][i];
                }
                if (count[idx] == 0) {
                    count[idx] = 1;
                } else {
                    isRight = false;
                    break;
                }
            }
            if (!isRight) {
                break;
            }
        }
        return isRight;
    }
}
