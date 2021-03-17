package com.itvillage.lecture.algroithm_with_python.section03;

import java.util.Scanner;

/**
 * 숫자만 추출
 */
public class Section03Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                result += c;
            }
        }

        StringBuffer sb = new StringBuffer(result);
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        int num = Integer.parseInt(sb.toString());

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        System.out.println(num);
        System.out.println(count);
    }
}
