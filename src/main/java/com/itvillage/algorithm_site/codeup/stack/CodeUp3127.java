package com.itvillage.algorithm_site.codeup.stack;

import java.util.Scanner;
import java.util.Stack;


public class CodeUp3127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] exps = scanner.nextLine().split(" ");

        Stack<String> st = new Stack<>();
        int result = 0;
        for (String s : exps) {
            if (!Character.isDigit(s.charAt(0))) {
                int first = Integer.parseInt(st.pop());
                int second = Integer.parseInt(st.pop());
                if (s.equals("+")) {
                    result = second + first;
                } else if (s.equals("-")) {
                    result = second - first;
                } else if (s.equals("*")) {
                    result = second * first;
                } else if (s.equals("/")) {
                    result = second / first;
                }
                st.push(String.valueOf(result));
            } else {
                st.push(s);
            }
        }

        System.out.print(result);
    }
}
