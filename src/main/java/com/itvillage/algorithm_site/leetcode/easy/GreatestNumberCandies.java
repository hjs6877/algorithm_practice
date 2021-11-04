package com.itvillage.algorithm_site.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.print(result);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNumber = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= maxNumber) {
                result.add(Boolean.TRUE);
            } else {
                result.add(Boolean.FALSE);
            }
        }
        return result;
    }
}
