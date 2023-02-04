package com.itvillage.algorithm_site.programmers.check_skill.level1;

import java.util.HashMap;
import java.util.Map;

public class MatchNumString {
    public static void main(String[] args) {
        String s = "123";
        int answer = solution(s);

        System.out.println(answer);
    }

    public static int solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                sb.append(c);
                String num = sb.toString();
                if (map.containsKey(num)) {
                    result.append(map.get(num));
                    sb.delete(0, sb.length());
                }
            } else {
                result.append(c);
            }
        }
        int answer = Integer.parseInt(result.toString());
        return answer;
    }
}
