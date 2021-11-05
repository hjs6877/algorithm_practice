package com.itvillage.algorithm_site.leetcode.easy.arrays;

public class FindEvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        int result = findNumbers(nums);

        System.out.println(result);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
