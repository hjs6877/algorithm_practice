package com.itvillage.lecture.algroithm_with_python.section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * 후위식 연산하기
 */
public class Section05Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Stack<Integer> st = new Stack<>();

        int result = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                st.push(Character.getNumericValue(ch));
            } else {
                int second = st.peek();
                st.pop();
                int first = st.peek();
                st.pop();

                result = calculate(first, second, ch);
                st.push(result);
            }
        }
        System.out.print(result);
    }

    private static int calculate(int first, int second, char ch) {
        int result = 0;
        if (ch == '+') {
            result = Math.addExact(first, second);
        } else if (ch == '-') {
            result = Math.subtractExact(first, second);
        } else if (ch == '*') {
            result = Math.multiplyExact(first, second);
        } else if (ch == '/') {
            result = Math.floorDiv(first, second);
        }
        return result;
    }
}
