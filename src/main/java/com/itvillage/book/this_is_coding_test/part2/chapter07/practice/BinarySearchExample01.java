package com.itvillage.book.this_is_coding_test.part2.chapter07.practice;

import java.util.Scanner;

public class BinarySearchExample01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int target = scanner.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }

        int start = 0;
        int end = count-1;
        int mid = end/2;
        System.out.print(mid);
        while (target != mid) {
            /**
             * arr[mid]가 target 보다 크다면,
             *  - end 는 mid - 1
             *  - mid를 다시 구한다.
             * arr[mid]가 target 보다 작다면,
             *  - start 는 mid + 1
             *  - mid는 다시 구한다.
             */
        }
    }
}
