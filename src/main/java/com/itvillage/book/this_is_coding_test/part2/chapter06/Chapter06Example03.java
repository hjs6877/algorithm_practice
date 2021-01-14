package com.itvillage.book.this_is_coding_test.part2.chapter06;

public class Chapter06Example03 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        for (int i = 1; i < arr.length; i++) {
            int now = i;
            for (int prev = now - 1; prev >= 0; prev--) {
                if (arr[now] < arr[prev]) {
                    int temp = arr[now];
                    arr[now] = arr[prev];
                    arr[prev] = temp;
                    now = prev;
                } else {
                    break;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
