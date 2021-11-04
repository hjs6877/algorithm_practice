package com.itvillage.algorithm_site.leetcode.easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class SumUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int result = sumOfUnique(nums);

        System.out.print(result);
    }

    public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int sum = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                sum += key;
            }
        }

        return sum;
    }
}
