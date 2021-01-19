package com.itvillage.book.this_is_coding_test.part2.chapter06;

/**
 * 계수 정렬
 */
public class Chapter06Example06 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int[] count = new int[10];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            for (int j = count[i]; j > 0; j--) {
                System.out.print(i + " ");
            }
        }
    }
}
