package com.itvillage.algorithm_site.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class SortingSentence {
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        String result = sortSentence(s);

        System.out.print(result);
    }

    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        Map<Integer, String> map = new HashMap<>();

        for (String word : words) {
            Integer key = Integer.parseInt(word.substring(word.length() - 1));
            String value = word.substring(0, word.length() - 1);
            map.put(key, value);
        }

        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys);

        StringJoiner sj = new StringJoiner(" ");
        for (Integer key : map.keySet()) {
            sj.add(map.get(key));
        }
        return sj.toString();
    }
}
