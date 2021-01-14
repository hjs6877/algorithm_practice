package com.itvillage.book.this_is_coding_test.part2.chapter06;

public class Chapter06Example01 {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 0; i < numbers.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp;
            temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

