package com.itvillage.algorithm_site.testdome;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueProduct {
    public static String firstUniqueProduct(String[] products) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String product : products) {
            if (map.containsKey(product)) {
                map.put(product, map.get(product) + 1);
            } else {
                map.put(product, 1);
            }
        }

        Map.Entry<String, Integer> entry =
                map.entrySet()
                        .stream()
                        .filter(product -> product.getValue() == 1)
                        .findFirst()
                        .orElse(new AbstractMap.SimpleEntry<>("noexist", null));

        return entry.getKey().equals("noexist") ? null : entry.getKey();
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[] { "Apple", "Apple", "Melon", "Pear"}));
    }
}
