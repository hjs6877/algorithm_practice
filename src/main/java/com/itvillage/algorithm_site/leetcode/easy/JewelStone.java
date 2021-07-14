package com.itvillage.algorithm_site.leetcode.easy;

public class JewelStone {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = numJewelsInStones(jewels, stones);

        System.out.print(result);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char jewel : jewels.toCharArray()) {
            for (char stone : stones.toCharArray()) {
                if (jewel == stone) {
                    count++;
                }
            }
        }

        return count;
    }
}
