package com.itvillage.lecture.algroithm_with_python.section02;

import java.util.Scanner;

/**
 * 뒤집은 소수
 *  - StringBuffer 또는 StringBuilder를 사용해서 문자열을 뒤집을 수 있고, '0'을 제거할 수 있다.
 */
public class SectionProblem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String[] str = scanner.nextLine().split(" ");
        for (String num : str) {
            String reverse = reverse(num);
            if (isPrime(Integer.parseInt(reverse))) {
                System.out.print(reverse + " ");
            }
        }
    }

    private static boolean isPrime(int num) {

        if(num == 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (i != num && num % i == 0) {
               return false;
            }
        }
        return true;
    }

    public static String reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
