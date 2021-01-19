package com.itvillage.book.this_is_coding_test.part2.chapter06;

/**
 * 퀵 정렬
 */
public class Chapter06Example04 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        // 종료 조건 지정
        if(start >= end) return;
        int pivot = start;
        int left = pivot + 1;
        int right = end;

        while (left <= right) {
            while(left <= end && arr[left] <= arr[pivot]) left++;
            while(right > start && arr[right] >= arr[pivot]) right--;

            if (left > right) {
                int temp = arr[right];
                arr[right] = arr[pivot];
                arr[pivot] = temp;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        quickSort(arr, start, right -1);
        quickSort(arr, right + 1, end);
    }
}
