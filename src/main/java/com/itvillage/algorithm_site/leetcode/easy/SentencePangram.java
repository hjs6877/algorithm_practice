package com.itvillage.algorithm_site.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class SentencePangram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        boolean result = checkIfPangram(sentence);

        System.out.print(result);
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char ch : sentence.toCharArray()) {
            set.add(ch);
            if (set.size() == 26) {
                return true;
            }
        }
        return false;
    }
}
