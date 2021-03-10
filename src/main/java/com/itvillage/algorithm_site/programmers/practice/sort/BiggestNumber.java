package com.itvillage.algorithm_site.programmers.practice.sort;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};

        String result = solution(numbers);

        System.out.print(result);
    }

    private static String solution(int[] numbers) {
        String answer = "";
        String[] nums = new String[numbers.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }

        // 문자열을 붙일 경우 큰 수 순으로 정렬
        Arrays.sort(nums, (s1, s2) -> ((s2+s1).compareTo((s1+s2))));

        if (nums[0].equals("0")) {
            return "0";
        }

        for (String s : nums) {
            answer += s;
        }
        return answer;
    }

}
