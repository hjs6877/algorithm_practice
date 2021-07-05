package com.itvillage.algorithm_site.leetcode.easy;

public class DefangingIP {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        String result = defangIPaddr(address);

        System.out.print(result);
    }

    public static String defangIPaddr(String address) {
        String[] addrs = address.split("\\.");
        return String.join("[.]", addrs);
    }
}
