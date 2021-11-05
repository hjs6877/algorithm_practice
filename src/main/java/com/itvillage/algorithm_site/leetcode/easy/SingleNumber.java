package com.itvillage.algorithm_site.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {-1};
        int result = singleNumber(arr);
        System.out.print(result);
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.get(n) != null) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        int result = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                result = key;
                break;
            }
        }

        return result;
    }
}
