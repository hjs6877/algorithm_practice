package com.itvillage.algorithm_site.leetcode.easy;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        System.out.print(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 100;
                cnt++;
            }
        }

        Arrays.sort(nums);
        return nums.length - cnt;
    }
}
