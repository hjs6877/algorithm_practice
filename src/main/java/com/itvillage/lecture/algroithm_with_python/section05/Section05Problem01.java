package com.itvillage.lecture.algroithm_with_python.section05;

import java.util.Scanner;
import java.util.Stack;

/**
 * 가장 큰 수
 */
public class Section05Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = String.valueOf(scanner.next());
        int m = scanner.nextInt();

        Stack<Character> s = new Stack<>();
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            while (!s.isEmpty() && count < m && s.peek() < num.charAt(i)) {
                s.pop();
                count++;
            }
            if (s.size() < num.length() - m) {
                s.push(num.charAt(i));
            }
        }

        StringBuffer sb = new StringBuffer();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }

        System.out.println(sb.reverse().toString());
    }
}
