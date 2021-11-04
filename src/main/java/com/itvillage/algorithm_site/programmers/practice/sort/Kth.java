package com.itvillage.algorithm_site.programmers.practice.sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kth {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = solution(arr, commands);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        int[][] substr = new int[commands.length][];
        for (int i = 0; i < commands.length; i++) {
            int[] ar = new int[commands[i][1] - commands[i][0] + 1];
            int k = commands[i][0] - 1;
            for (int j = 0; j < commands[i][1] - commands[i][0] + 1; j++) {
                ar[j] = array[k];
                k++;
            }
            substr[i] = ar;
        }

        for (int i = 0; i < substr.length; i++) {
            Arrays.sort(substr[i]);
            int n = substr[i][commands[i][2] - 1];
            ;

            result[i] = n;
        }
        return result;
    }
}
