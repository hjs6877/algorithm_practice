package com.itvillage.algorithm_site.codewars.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareDigit {
    public static void main(String[] args) {
        int result = squareDigits(9119);

        System.out.print(result);
    }

    private static int squareDigits(int n) {
        String[] numbers = String.valueOf(n).split("");
        String result = Arrays
                .stream(numbers)
                .mapToInt(Integer::parseInt)
                .map(num -> num * num)
                .mapToObj(num -> String.valueOf(num))
                .collect(Collectors.joining());
        return Integer.parseInt(result);
    }
}
