package com.itvillage.algorithm_site.leetcode.easy;


import java.util.HashMap;
import java.util.Map;

public class FindCenterStarGraph {
    public static void main(String[] args) {
        int[][] edges = {{1,2}, {5,1}, {1,3}, {1,4}};
        int result = findCenter(edges);

        System.out.print(result);
    }

    public static int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        int center = 0;
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                int idx = edges[i][j];
                if (map.get(idx) == null) {
                    map.put(idx, 1);
                } else {
                    map.put(idx, map.get(idx) + 1);
                }
                if (map.get(idx) > 1) {
                    center = idx;
                    return center;
                }
            }
        }

        return center;
    }
}
