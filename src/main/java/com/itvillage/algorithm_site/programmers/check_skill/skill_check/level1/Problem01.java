package com.itvillage.algorithm_site.programmers.check_skill.skill_check.level1;

/**
 * 문자열 숫자 더하기
 */
public class Problem01 {
    public static void main(String[] args) {
        int result = solution(987);

        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 0;

        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            answer += Character.getNumericValue(num.charAt(i));
        }

        return answer;
    }
}
