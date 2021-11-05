package com.itvillage.algorithm_site.codeup.search_based;

import java.util.Scanner;

/**
 * 유클리드 호제법 사용.
 * - 큰 수를 작은 수로 나누어서 나머지가 0이면 작은 수가 최대 공약수이다.
 * - 큰 수를 작은 수로 나누어서 나머지가 0이 아니라면 큰수를 버리고, 작은 수를 나머지로 나누는 과정을 계속해서
 * 나머지가 0일 경우를 찾는다.
 */
public class CodeUp2623 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (true) {
            int result = gcd(a, b);
            if (result == 0) {
                System.out.print(Math.min(a, b));
                return;
            } else {
                a = Math.min(a, b);
                b = result;
            }
        }
    }

    private static int gcd(int a, int b) {
        int remain = Math.max(a, b) % Math.min(a, b);
        return remain;
    }
}
