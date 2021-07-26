package com.itvillage.algorithm_site.leetcode.easy;

import java.util.stream.Collectors;

public class CountConsistentStrings {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        int result = countConsistentStrings(allowed, words);

        System.out.println(result);
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        String[] distinctWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String distinctWord = words[i].chars().mapToObj(c -> Character.toString((char)c))
                    .distinct().collect(Collectors.joining());
            distinctWords[i] = distinctWord;
        }

        int count = 0;
        for (String word : distinctWords) {
            for (char c : word.toCharArray()) {
                if(!allowed.contains(Character.toString(c))) {
                    count++;
                    break;
                }
            }
        }
        return distinctWords.length - count;
    }
}
