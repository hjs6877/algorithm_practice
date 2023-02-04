package com.itvillage.algorithm_site.programmers.practice.level0;

import java.util.Arrays;
import java.util.List;

/**
 * 옹알이 (1)
 */
public class Babbling {
    public static void main(String[] args) {
        String[] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
        int result1 = solution(babbling1);

        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        int result2 = solution(babbling2);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int result = 0;
        for (String b : babbling) {
            String remain = b;
            while (remain.length() != 0) {
                int hit = 0;
                for (String word : words) {
                    if (remain.startsWith(word)) {
                        remain = remain.replace(word, "");
                        hit++;
                    }
                }
                if (hit == 0) {
                    break;
                }
                else if (remain.length() == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
