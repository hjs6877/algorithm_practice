package com.itvillage.algorithm_site.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColorItemMatchRule {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","phone"),
                Arrays.asList("phone","gold","iphone")
        );
        String ruleKey = "type";
        String ruleValue = "phone";
        int result = countMatches(items, ruleKey, ruleValue);

        System.out.print(result);
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int idx = ruleKey.equals("type") ? 0 : (ruleKey.equals("color") ? 1 : 2);

        for (List<String> item : items) {
            if (ruleValue.equals(item.get(idx))) {
                count++;
            }
        }

        return count;
    }
}
