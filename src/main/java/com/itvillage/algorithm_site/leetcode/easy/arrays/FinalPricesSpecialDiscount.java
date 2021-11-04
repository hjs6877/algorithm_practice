package com.itvillage.algorithm_site.leetcode.easy.arrays;

public class FinalPricesSpecialDiscount {
    public static void main(String[] args) {
        int[] prices = {10, 1, 1, 6};
        int[] result = finalPrices(prices);

        for (int p : result) {
            System.out.print(p + " ");
        }
    }

    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
