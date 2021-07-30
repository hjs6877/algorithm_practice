package com.itvillage.algorithm_site.leetcode.easy.strings;

import java.util.Arrays;
import java.util.List;

public class StringHalvesAlike {
    public static void main(String[] args) {
        String s = "MerryChristmas";
        boolean result = halvesAreAlike(s);

        System.out.println(result);
    }

    public static boolean halvesAreAlike(String s) {
        int lCount = 0;
        int rCount = 0;

        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < s.length() / 2; i++) {
            if (list.contains(Character.toLowerCase(s.charAt(i)))) {
                lCount++;
            }

            if (list.contains(Character.toLowerCase(s.charAt(i + (s.length() / 2))))) {
                rCount++;
            }
        }

        return lCount == rCount;
    }
}
