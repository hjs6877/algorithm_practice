package com.itvillage.algorithm_site.codeup.stack;

import java.util.Scanner;
import java.util.Stack;

public class CodeUp3117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] nums = new int[k];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        Stack stack = new Stack();
        for (int n : nums) {
            if (n != 0) {
                stack.push(n);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        int sum = 0;
        int count = stack.size();
        for (int i = 0; i < count; i++) {
            sum += (int) stack.pop();
        }

        System.out.print(sum);
    }

}
