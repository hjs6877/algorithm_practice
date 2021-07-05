package com.itvillage.algorithm_site.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        boolean result = isHappy(n);
        System.out.print(result);
    }

    public static boolean isHappy(int n) {
        boolean isHappy;
        Set<Integer> set = new HashSet<>();
        while (true) {
            String num = n + "";
            int p = 0;
            for (char c : num.toCharArray()) {
                p += Math.pow(Character.getNumericValue(c), 2);
            }
            if (p == 1) {
                isHappy = true;
                break;
            } else {
                if (set.contains(p)) {
                    isHappy = false;
                    break;
                }
                n = p;
                set.add(p);
            }
        }
        return isHappy;
    }
}
