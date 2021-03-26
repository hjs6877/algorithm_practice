package com.itvillage.lecture.algroithm_with_python.section04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 랜선 자르기(결정 알고리즘)
 *  - 이진 탐색을 이용해서 잘라야 되는 랜선의 최대 길이를 구한다.
 */
public class Section04Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int start = 0;
        int end = arr[arr.length - 1];
        int mid = findMidValue(start, end);
        int max = 0;
        while (start <= end) {
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                count += arr[i] / mid;
            }
            if (count < n) {
                end = mid - 1;
            } else {
                start = mid + 1;
                max = Math.max(max, mid);
            }
            mid = findMidValue(start, end);
        }
        System.out.print(max);
    }

    private static int findMidValue(int start, int end) {
        return (start + end) / 2;
    }
}
