package com.itvillage.lecture.algroithm_with_python.section04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 정답이랑 틀림. pass!
 */
public class Section04Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int start = 1;
        int end = Arrays.stream(arr).sum();
        int answer = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (cdCount(mid, arr) <= m) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.print(answer);
    }

    private static int cdCount(int capacity, int[] arr) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + i > capacity) {
                count++;
                sum = i;
            } else {
                if (i == arr.length - 1) {
                    count++;
                } else {

                }
            }
        }
        return count;
    }
}
