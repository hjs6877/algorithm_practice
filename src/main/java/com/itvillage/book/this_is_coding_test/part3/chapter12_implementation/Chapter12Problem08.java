package com.itvillage.book.this_is_coding_test.part3.chapter12_implementation;

import java.util.*;
import java.util.stream.Collectors;

public class Chapter12Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<Character> extract = new ArrayList<>();

        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            } else {
                extract.add(c);
            }
        }

        Collections.sort(extract);
        String extractStr = extract.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.print(extractStr + sum);
    }
}
