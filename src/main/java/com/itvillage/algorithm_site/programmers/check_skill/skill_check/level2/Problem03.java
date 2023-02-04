package com.itvillage.algorithm_site.programmers.check_skill.skill_check.level2;

import java.util.Scanner;

/**
 * 점프 이외의 이동시 배터리 소모량 문제
 */
public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = solution(n);

        System.out.println(result);
    }

    public static int solution(int n) {
        int count = 0;
        if (n % 2 == 0) {
            while (n > 1) {
                if (n % 2 != 0) {
                    count = count + (n % 2);
                }
                n /= 2;
            }
        } else {
            count = n % 2;
        }
        return count + 1;
    }
}
