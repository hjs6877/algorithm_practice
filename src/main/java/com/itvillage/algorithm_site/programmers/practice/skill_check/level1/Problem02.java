package com.itvillage.algorithm_site.programmers.practice.skill_check.level1;

public class Problem02 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        int result = solution(nums);

        System.out.println(result);
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            int one = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int two = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    int three = nums[k];
                    int sum = one + two + three;
                    boolean isPrime = true;
                    for (int l = 2; l < sum; l++) {
                        if (sum % l == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if (isPrime) {
                        answer++;
                    }
                }
            }
        }


        return answer;
    }
}
