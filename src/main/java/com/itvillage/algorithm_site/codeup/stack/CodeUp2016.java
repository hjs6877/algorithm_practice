package com.itvillage.algorithm_site.codeup.stack;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

// TODO 해결 필요
public class CodeUp2016 {
    private static Stack<String> stack = new Stack();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String num = scanner.nextLine();
        String[] nums = num.split("");

        addAll(nums);

        String result = "";
        for (int i = 1; !stack.isEmpty(); i++) {
            result += stack.peek();
            stack.pop();
            if (i % 3 == 0 && !stack.isEmpty()) {
                result += ",";
            }

        }

        String[] rNum = result.split("");
        addAll(rNum);

        while (!stack.isEmpty()) {
            System.out.print(stack.peek());
            stack.pop();
        }
    }

    private static void addAll(String[] nums) {
        for (String n : nums) {
            stack.add(n);
        }

    }
}
