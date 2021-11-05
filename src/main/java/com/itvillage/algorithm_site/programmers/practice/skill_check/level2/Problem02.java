package com.itvillage.algorithm_site.programmers.practice.skill_check.level2;

/**
 * JadenCase 문자열 만들기. 문자열 각 단어의 첫번째 문자를 대문자로 만들기
 */
public class Problem02 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        String result = solution(s);

        System.out.println(result);
    }

    public static String solution(String s) {
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            String words = split[i];
            String converted = "";
            for (int j = 0; j < words.length(); j++) {
                char c = words.charAt(j);
                if (j == 0) {
                    if (Character.isAlphabetic(c)) {
                        converted += Character.toUpperCase(c);
                    } else {
                        converted += c;
                    }
                } else {
                    converted += Character.toLowerCase(c);
                }
            }
            split[i] = converted;
        }
        return String.join(" ", split);
    }
}
