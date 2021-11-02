package com.itvillage.algorithm_site.programmers.practice.level1;

public class LottoRanking {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] winNums = {31, 10, 45, 1, 6, 19};
        int[] result = solution(lottos, winNums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int minRank;
        int maxRank;
        int correctCount = 0;
        int zeroCount = 0;

        boolean[] numbers = new boolean[46];
        for (int num : win_nums) {
            numbers[num] = true;
        }

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else {
                if (numbers[num]) {
                    correctCount++;
                }
            }
        }

        maxRank = zeroCount + correctCount > 1 ? 6 - (zeroCount + correctCount) + 1 : 6;
        minRank = correctCount > 1 ? 6 - correctCount + 1 : 6;

        answer[0] = maxRank;
        answer[1] = minRank;
        return answer;
    }
}
