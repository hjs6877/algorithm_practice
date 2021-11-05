package com.itvillage.algorithm_site.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> paths = Arrays.asList(
                Arrays.asList("B", "C"),
                Arrays.asList("D", "B"),
                Arrays.asList("C", "A")
        );
        String result = destCity(paths);

        System.out.println(result);
    }

    public static String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }

        String dest = "";
        for (String key : map.keySet()) {
            if (!map.containsKey(map.get(key))) {
                dest = map.get(key);
                break;
            }
        }
        return dest;
    }
}
