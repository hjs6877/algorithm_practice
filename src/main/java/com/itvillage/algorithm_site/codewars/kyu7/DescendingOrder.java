package com.itvillage.algorithm_site.codewars.kyu7;

import java.util.Arrays;
import java.util.Collections;


public class DescendingOrder {
    public static void main(String[] args) {
        int max = sortDesc(42145);
        System.out.println(max);
    }

    public static int sortDesc(final int num) {
        String[] numbers = String.valueOf(num).split("");
        Arrays.sort(numbers, Collections.reverseOrder());
        return Integer.parseInt(String.join("", numbers));
    }
}
