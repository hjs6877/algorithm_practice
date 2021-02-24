package com.itvillage.algorithm_site.programmers.practice.hash;


import java.util.HashMap;
import java.util.Map;

public class MarathonCompletion {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String answer = solution(participant, completion);
        System.out.print(answer);
    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String c : completion) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (String pp : participant) {
            if (map.containsKey(pp) && map.get(pp) >= 1) {
                map.put(pp, map.get(pp) - 1);
            } else if (map.containsKey(pp) && map.get(pp) <= 0) {
                answer = pp;
                break;
            } else if (!map.containsKey(pp)) {
                answer = pp;
                break;
            }
        }
        return answer;
    }

}
