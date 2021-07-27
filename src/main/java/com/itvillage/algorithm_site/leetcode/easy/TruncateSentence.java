package com.itvillage.algorithm_site.leetcode.easy;

import java.util.StringJoiner;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;

        String result = truncateSentence(s, k);

        System.out.println(result);
    }

    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < k; i++) {
            sj.add(words[i]);
        }
        return sj.toString();
    }
}
