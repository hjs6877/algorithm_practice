package com.itvillage.algorithm_site.leetcode.easy.strings;

import java.util.HashMap;
import java.util.Map;

public class RobotReturnOrigin {
    public static void main(String[] args) {
        String moves = "LDRRLRUULR";
        boolean result = judgeCircle(moves);

        System.out.print(result);
    }

    public static boolean judgeCircle(String moves) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('L', -1);
        map.put('R', 1);
        map.put('U', -10);
        map.put('D', 10);

        for (char c : moves.toCharArray()) {
            result += map.get(c);
        }

        return result == 0;
    }
}
