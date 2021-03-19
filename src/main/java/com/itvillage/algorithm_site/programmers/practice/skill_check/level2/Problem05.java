package com.itvillage.algorithm_site.programmers.practice.skill_check.level2;

public class Problem05 {
    public static void main(String[] args) {
        int[] result = solution(24, 24);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] solution(int brown, int yellow) {
        int a = brown + yellow;
        int row = 0, col = 0;
        for (int i = a; i > 0 ; i--) {
            if (a % i == 0) {
                col = i;
                row = a / i;

                int x = row - 2;
                int y = col - 2;
                if (x * y == yellow) {
                    break;
                }
            }
        }

        return new int[]{col, row};
    }
}
