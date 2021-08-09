package com.itvillage.algorithm_site.leetcode.easy.strings;

import java.util.*;
import java.util.stream.Collectors;

public class IncreasingDecreasingString {
    public static void main(String[] args) {
        String s = "leetcode";
        String result = sortString(s);
        System.out.println(result);
    }

    public static String sortString(String s) {
        List<Character> chars = s.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();

        String order = "asc";

        while (chars.size() > 0) {
            Set<Character> set = new HashSet<>();
            for (char c : chars) {
                set.add(c);
            }

            List<Character> list = new ArrayList<>(set);
            if (order.equals("asc")) {
                Collections.sort(list);
                order = "desc";
            } else {
                Collections.sort(list, Collections.reverseOrder());
                order = "asc";
            }
            for (char c : list) {
                sb.append(c);

                int i = chars.indexOf(c);
                if (i != -1) {
                    chars.remove(i);
                }
            }
        }

        return sb.toString();
    }
}
