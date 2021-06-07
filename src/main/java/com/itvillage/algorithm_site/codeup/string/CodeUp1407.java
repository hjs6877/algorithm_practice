package com.itvillage.algorithm_site.codeup.string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CodeUp1407 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] s = str.split(" ");
        System.out.print(Arrays.stream(s).collect(Collectors.joining()));
    }
}
