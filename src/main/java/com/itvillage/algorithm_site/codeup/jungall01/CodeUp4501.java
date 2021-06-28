package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CodeUp4501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = new Integer[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
