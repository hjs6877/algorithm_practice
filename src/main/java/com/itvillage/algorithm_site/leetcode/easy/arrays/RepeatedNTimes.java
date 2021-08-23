package com.itvillage.algorithm_site.leetcode.easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class RepeatedNTimes {
    public static void main(String[] args) {
        int[] nums = {5,1,5,2,5,3,5,4};
        int result = repeatedNTimes(nums);

        System.out.print(result);
    }

    public static int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                return num;
            }
        }

        return 0;
    }
}
