package com.itvillage.algorithm_site.leetcode.easy;

public class NumberStepReduce {
    public static void main(String[] args) {
        int num = 14;
        int result = numberOfSteps(num);

        System.out.print(result);
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            count++;
        }
        return count;
    }
}
