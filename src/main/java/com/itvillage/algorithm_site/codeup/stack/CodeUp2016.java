package com.itvillage.algorithm_site.codeup.stack;

import java.util.Scanner;

// TODO 해결 필요
public class CodeUp2016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        String num = scanner.nextLine();
        String[] nums = num.split("");
        String[] reverse = new String[nums.length];

        for (int i = 0; i < length; i++) {
            int rIndex = (num.length() - 1) - i;
            reverse[rIndex] = nums[i];
        }

        String appended = "";
        for (int i = 0; i < length; i++) {
            appended += reverse[i];
            if (i % 3 == 0) {
                appended += ",";
            }
        }

        System.out.print(appended);
    }
}
