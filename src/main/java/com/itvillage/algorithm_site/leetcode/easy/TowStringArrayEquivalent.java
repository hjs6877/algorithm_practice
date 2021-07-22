package com.itvillage.algorithm_site.leetcode.easy;

public class TowStringArrayEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean result = arrayStringsAreEqual(word1, word2);

        System.out.print(result);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String joinedWord1 = String.join("", word1);
        String joinedWord2 = String.join("", word2);

        return joinedWord1.equals(joinedWord2);
    }
}
