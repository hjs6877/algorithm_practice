package com.itvillage.algorithm_site.programmers.check_skill.level1;

public class RecommendNewId {
    public static void main(String[] args) {
        String newId = "abcdefghijklmn.p";
        String answer = solution(newId);

        System.out.println(answer);
    }

    public static String solution(String new_id) {
        String answer = "";

        // 1단계
        answer = new_id.toLowerCase();

        // 2단계
        StringBuilder sb = new StringBuilder();
        for (char c : answer.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }
        answer = sb.toString();
        sb.delete(0, sb.length());

        // 3단계
        for (char c : answer.toCharArray()) {
            if (sb.length() > 0 && c == '.' && sb.charAt(sb.length() - 1) == '.') {
                continue;
            }
            sb.append(c);
        }

        answer = sb.toString();

        // 4단계
        if (sb.length() > 0 && sb.charAt(0) == '.') {
            sb.deleteCharAt(0);
        }

        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }

        answer = sb.toString();

        // 5단계
        if (answer.length() == 0) {
            answer = "a";
        }

        // 6단계
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, 14);
            }
        }

        // 7단계
        if (answer.length() <= 2) {
            char c = answer.charAt(answer.length() - 1);
            while (answer.length() < 3) {
                answer += c;
            }
        }
        return answer;
    }
}
