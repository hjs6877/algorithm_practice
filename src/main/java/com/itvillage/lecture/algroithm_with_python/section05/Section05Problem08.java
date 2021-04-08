package com.itvillage.lecture.algroithm_with_python.section05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 단어 찾기
 */
public class Section05Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] w1 = new String[n];
        String[] w2 = new String[n-1];

        for (int i = 0; i < w1.length; i++) {
            w1[i] = scanner.next();
        }

        for (int i = 0; i < w2.length; i++) {
            w2[i] = scanner.next();
        }

        Map<String, Boolean> map = new HashMap<>();
        for (String s : w2) {
            map.put(s, true);
        }

        for (String s : w1) {
            if(!map.containsKey(s)){
                System.out.print(s);
                break;
            }
        }
    }
}
