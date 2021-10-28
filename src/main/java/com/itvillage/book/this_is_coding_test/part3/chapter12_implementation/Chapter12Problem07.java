package com.itvillage.book.this_is_coding_test.part3.chapter12_implementation;

public class Chapter12Problem07 {
    public static void main(String[] args) {
        int n = 123402;
        String num = String.valueOf(n);
        int h = num.length() / 2;
        String left = num.substring(0, h);
        String right = num.substring(h);
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < left.length(); i++) {
            leftSum += Character.getNumericValue(left.charAt(i));
            rightSum += Character.getNumericValue(right.charAt(i));
        }

        if (leftSum == rightSum) {
            System.out.print("LUCKY");
        } else {
            System.out.print("READY");
        }
    }
}
