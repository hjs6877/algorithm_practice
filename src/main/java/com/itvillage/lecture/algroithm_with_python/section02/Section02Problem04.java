package com.itvillage.lecture.algroithm_with_python.section02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 대표값 구하기
 */
public class Section02Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        double sum = Arrays.stream(arr).sum();
        int avg = (int) Math.round(sum / arr.length);

        int mIdx = 0;
        int nDiff;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            nDiff = Math.abs(avg - arr[i]);
            if ((nDiff < minDiff) || (nDiff == minDiff && arr[mIdx] < arr[i]) ||
                    (nDiff == minDiff && arr[mIdx] == arr[i] && mIdx > i)) {
                mIdx = i;
                minDiff = nDiff;
            }
        }

        System.out.print(avg + " " + (mIdx + 1));
    }
}
