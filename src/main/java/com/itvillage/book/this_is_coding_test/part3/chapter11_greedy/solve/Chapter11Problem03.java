package com.itvillage.book.this_is_coding_test.part3.chapter11_greedy.solve;

public class Chapter11Problem03 {
    public static void main(String[] args) {
        String s = "0001100";
        int zeroCnt = 0;
        int oneCnt = 0;

        char now = s.charAt(0);
        for (int i = 0; i < s.length() - 1; i++) {
            char next = s.charAt(i + 1);
            if (now != next) {
                if (next == '0') oneCnt++;
                if (next == '1') zeroCnt++;
                now = next;
            }
        }
        if (now == '0') zeroCnt++;
        if (now == '1') oneCnt++;
        System.out.print(Math.min(zeroCnt, oneCnt));
    }
}
