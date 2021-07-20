package com.itvillage.algorithm_site.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class GoalParser {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        String result = interpret(command);

        System.out.print(result);
    }

    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                sb.append("G");
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sb.append("o");
                i++;
            } else if(command.charAt(i) == '(' && command.charAt(i + 1) == 'a'){
                sb.append("al");
                i = i + 2;
            }
        }
        return sb.toString();
    }
}
