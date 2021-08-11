package com.itvillage.algorithm_site.leetcode.easy.strings;

import java.util.HashSet;
import java.util.Set;

public class AllCharactersHaveEqualNumber {
    public static void main(String[] args) {
        String s = "abacbc";
        boolean result = areOccurrencesEqual(s);

        System.out.println(result);
    }

    public static boolean areOccurrencesEqual(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0) {
                set.add(cnt[i]);
            }
        }
        return set.size() == 1;
    }
}
