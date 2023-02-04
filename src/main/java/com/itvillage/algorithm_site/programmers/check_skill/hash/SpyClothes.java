package com.itvillage.algorithm_site.programmers.check_skill.hash;

import java.util.HashMap;
import java.util.Map;

public class SpyClothes {
    public static void main(String[] args) {
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"green_turban", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"smoky_makeup", "face"}
        };

        int answer = solution(clothes);

        System.out.println(answer);
    }

    public static int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            if (map.containsKey(type)) {
                map.put(type, map.get(type) + 1);
            } else {
                map.put(type, 1);
            }
        }

        int result1 = 0;

        for (String key : map.keySet()) {
            result1 += map.get(key);
        }

        // TODO 경우의 수가 더 나오는구나. 다시 계산 해야됨
        int result2 = 0;
        if (map.keySet().size() > 1) {
            result2 = 1;
            for (String key : map.keySet()) {
                result2 *= map.get(key);
            }
        }

        answer = result1 + result2;
        return answer;
    }
}
