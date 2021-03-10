package com.itvillage.algorithm_site.programmers.practice.skill_check.level1;

/**
 * 문자열 반복 문제
 */
public class Problem3 {
    public static void main(String[] args) {
        String result = solution(4);

        System.out.print(result);
    }

    public static String solution(int n) {
        String str = "수박";
        String answer = "";
        int a = n / 2;
        int b = n % 2;
        for (int i = 0; i < a; i++) {
            answer += str;
        }
        if (b == 1) {
            answer += "수";
        }
        return answer;
    }
}
