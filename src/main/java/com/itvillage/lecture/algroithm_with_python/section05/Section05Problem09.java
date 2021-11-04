package com.itvillage.lecture.algroithm_with_python.section05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 아나그램
 */
public class Section05Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s2.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : s1.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
            }
        }


        if (map.entrySet().stream().anyMatch(e -> e.getValue() != 0)) {
            System.out.print("NO");
        } else {
            System.out.print("YES");
        }
    }
}
