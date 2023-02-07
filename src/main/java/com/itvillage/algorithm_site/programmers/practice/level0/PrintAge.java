package com.itvillage.algorithm_site.programmers.practice.level0;

import java.time.LocalDateTime;

public class PrintAge {
    public static void main(String[] args) {
        int result = solution(40);

        System.out.println(result);
    }

    private static int solution(int age) {
        return LocalDateTime.now().getYear() - age;
    }
}
