package com.itvillage.algorithm_site.leetcode.easy;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int result = maximumWealth(accounts);
        System.out.print(result);
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] customers : accounts) {
            int sum = 0;
            for (int money : customers) {
                sum += money;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}
