package com.itvillage.algorithm_site.codeup.stack;

import java.util.Scanner;
import java.util.Stack;

public class CodeUp6329 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String[] strs = String.valueOf(number).split("");

        Stack<String> stack = new Stack<>();

        for (String str : strs) {
            stack.push(str);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.peek());
            stack.pop();
        }

        System.out.print(stringBuilder.toString());
    }
}
