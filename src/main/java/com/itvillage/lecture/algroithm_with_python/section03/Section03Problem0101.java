package com.itvillage.lecture.algroithm_with_python.section03;

import java.util.Scanner;

/**
 * 회문 문자열 검사
 */
public class Section03Problem0101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine().toLowerCase();
        }

        for (String s : arr) {
            int len = s.length();
            int left = 0;
            int right = len - 1;
            boolean isMatched = true;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    System.out.println("NO");
                    isMatched = false;
                    break;
                }
                left++;
                right--;
            }
            if (isMatched) {
                System.out.println("YES");
            }
        }
    }
}
