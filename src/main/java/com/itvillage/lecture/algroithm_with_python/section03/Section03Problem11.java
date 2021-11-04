package com.itvillage.lecture.algroithm_with_python.section03;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 * 격자판 회문수
 */
public class Section03Problem11 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[7][7];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        count = 0;
        // TODO 3중 for문으로 코드 개선이 필요함.
        cal(arr, "row");
        cal(arr, "col");

        System.out.print(count);
    }

    private static void cal(int[][] arr, String type) {
        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            int e = s + 4;
            while (s <= 2) {
                boolean isPd = true;
                for (int j = s; j < s + 2; j++) {
                    boolean matched = type.equals("row") ? arr[i][j] != arr[i][e - j + s] : arr[j][i] != arr[e - j + s][i];
                    if (matched) {
                        isPd = false;
                        break;
                    }
                }
                if (isPd) {
                    count++;
                }
                s++;
                e++;
            }
        }
    }
}
