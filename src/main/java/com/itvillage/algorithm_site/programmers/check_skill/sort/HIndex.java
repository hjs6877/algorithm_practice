package com.itvillage.algorithm_site.programmers.check_skill.sort;

public class HIndex {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        int result = solution(citations);

        System.out.print(result);
    }

    public static int solution(int[] citations) {
        int answer = 0;
        int max = 0;
        for (int c : citations) {
            max = Math.max(max, c);
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < citations.length; i++) {
            count[citations[i]]++;
        }


        for (int i = count.length - 1; i >= 0; i--) {
            int a = 0;
            int b = 0;

            for (int j = i; j < count.length; j++) {
                a += count[j];
            }

            for (int k = i - 1; k >= 0; k--) {
                if (k != 0) {
                    b += count[k];
                }

            }

            if (a >= i && b <= i) {
                answer = i;
                break;
            }

        }

        return answer;
    }
}
