package com.itvillage.algorithm_site.programmers.practice.skill_check.level1;

public class Problem04 {
    public static void main(String[] args) {
        long result = solution(121);

        System.out.println(result);
    }

    public static long solution(long n) {
        long answer = -1;
        long a = (long) Math.sqrt(n);
        double b = Math.pow(a, 2);

        if (n == b) {
            answer = (long) Math.pow(a + 1, 2);
        }
        return answer;
    }
}
