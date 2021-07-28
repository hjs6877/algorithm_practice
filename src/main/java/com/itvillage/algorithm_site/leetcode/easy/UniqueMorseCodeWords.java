package com.itvillage.algorithm_site.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        int result = uniqueMorseRepresentations(words);

        System.out.print(result);

    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
                "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character, String> map = new HashMap<>();
        for (char c = 'a'; c <= 'a' + 25; c++) {
            map.put(c, morseCodes[c - ('z' - 25)]);
        }

        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(map.get(c));
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
