package com.itvillage.book.this_is_coding_test.part2.chapter07.solve;

import java.util.Scanner;

public class BinarySearchExample01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int target = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }



        int result = binarySearch(arr, target, size);

        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        } else {
            System.out.println(arr[result]);
        }
    }

    private static int binarySearch(int[] arr, int target, int size) {
        int start = 0;
        int end = size-1;
        int mid = (start + end)/2;

        while (start <= end) {
            /**
             * arr[mid]가 target 보다 크다면,
             *  - end 는 mid - 1
             *  - mid를 다시 구한다.
             * arr[mid]가 target 보다 작다면,
             *  - start 는 mid + 1
             *  - mid는 다시 구한다.
             */
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
            mid = (start + end)/2;
        }
        return -1;
    }
}
