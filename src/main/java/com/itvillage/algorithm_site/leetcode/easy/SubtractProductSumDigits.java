package com.itvillage.algorithm_site.leetcode.easy;

import java.util.Arrays;

public class SubtractProductSumDigits {
    public static void main(String[] args) {
        int n = 4421;
        int result = subtractProductAndSum(n);

        System.out.print(result);
    }

    public static int subtractProductAndSum(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        int product = 1;
        for (char ch : str.toCharArray()) {
            sum += Character.getNumericValue(ch);
            product *= Character.getNumericValue(ch);
        }

        return product - sum;
    }
}
