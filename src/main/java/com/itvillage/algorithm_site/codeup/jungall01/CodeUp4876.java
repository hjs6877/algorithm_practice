package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeUp4876 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> aGames = new ArrayList<>();
        List<List<Integer>> bGames = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            aGames.add(new ArrayList<>());
            bGames.add(new ArrayList<>());
        }
        int aIdx = 0;
        int bIdx = 0;

        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
                int aAmount = scanner.nextInt();
                List<Integer> aGame = aGames.get(aIdx);
                for (int j = 0; j < aAmount; j++) {
                    aGame.add(scanner.nextInt());
                }
                aIdx++;
            } else {
                int bAmount = scanner.nextInt();
                List<Integer> bGame = bGames.get(bIdx);
                for (int j = 0; j < bAmount; j++) {
                    bGame.add(scanner.nextInt());
                }
                bIdx++;
            }
        }

        for (int i = 0; i < n; i++) {
            Integer[] aCnt = new Integer[5];
            Integer[] bCnt = new Integer[5];
            for (int j = 0; j < 5; j++) {
                aCnt[j] = 0;
                bCnt[j] = 0;
            }

            List<Integer> aGame = aGames.get(i);
            for (int j = 0; j < aGame.size(); j++) {
                aCnt[aGame.get(j)]++;
            }

            List<Integer> bGame = bGames.get(i);
            for (int j = 0; j < bGame.size(); j++) {
                bCnt[bGame.get(j)]++;
            }

            String result = null;
            for (int j = 4; j > 0; j--) {
                if (aCnt[j] > bCnt[j]) {
                    result = "A";
                    break;
                } else if (bCnt[j] > aCnt[j]) {
                    result = "B";
                    break;
                }
            }

            if (result == null) {
                System.out.println("D");
            } else {
                System.out.println(result);
            }
        }
    }
}
