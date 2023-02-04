package com.itvillage.algorithm_site.programmers.check_skill.skill_check.level2;

public class Problem04 {
    public static void main(String[] args) {
        int n = 5;
        int result = solution(n);

        System.out.print(result);
    }

    public static int solution(int n) {
        int prev2 = 0;
        int prev1 = 1;
        int now = 0;

        if (n == 1) {
            return 1 % 1234567;
        }

        for (int i = 2; i <= n; i++) {
            now = (prev2 + prev1) % 1234567;
            prev2 = prev1;
            prev1 = now;
        }
        return now;
    }
}
