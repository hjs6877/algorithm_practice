package com.itvillage.algorithm_site.programmers.check_skill.skill_check.level2;

/**
 * 배열의 모든 수에 대한 최소 공배수 구하기
 */
public class Problem01 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        int lcm = solution(arr);
        System.out.println(lcm);
    }

    public static int solution(int[] arr) {
        int targetLcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            targetLcm = lcm(targetLcm, arr[i]);
        }
        return targetLcm;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
