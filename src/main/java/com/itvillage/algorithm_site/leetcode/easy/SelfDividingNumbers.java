package com.itvillage.algorithm_site.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 47;
        int right = 85;
        List<Integer> results = selfDividingNumbers(left, right);

        System.out.print(results);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int q = i;
            int r;
            boolean divided = true;
            while (q != 0) {
                r = q % 10;
                q = q / 10;

                if (r == 0 || i % r != 0) {
                    divided = false;
                    break;
                }
            }

            if (divided) {
                list.add(i);
            }
        }

        return list;
    }
}
