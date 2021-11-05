package com.itvillage.algorithm_site.programmers.practice.hash;

import java.util.Arrays;
import java.util.List;

public class PhoneBook {
    public static void main(String[] args) {
        String[] phoneBook = {"12", "123", "1235", "567", "88"};
        boolean result = solution(phoneBook);

        System.out.print(result);
    }

    private static boolean solution(String[] phoneBook) {
        boolean answer = true;
        List<String> list = Arrays.asList(phoneBook);
        for (int i = 0; i < list.size() - 1; i++) {
            String prefix = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                String target = list.get(j);
                if (i == j) continue;
                if (prefix.length() > target.length()) continue;
                if (prefix.equals(target.substring(0, prefix.length()))) {
                    answer = false;
                    break;
                }
            }
            if (!answer) break;
        }
        return answer;
    }
}
