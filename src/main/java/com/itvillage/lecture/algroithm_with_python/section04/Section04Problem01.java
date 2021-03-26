package com.itvillage.lecture.algroithm_with_python.section04;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 이진 탐색. target 숫자가 위치한 index 구하기
 */
public class Section04Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int result = binarySearch(arr, target);

        System.out.print(result);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid + 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }
}
