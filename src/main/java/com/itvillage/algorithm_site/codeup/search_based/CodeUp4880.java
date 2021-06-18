package com.itvillage.algorithm_site.codeup.search_based;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeUp4880 {
    static int n, k, result;
    static List<List<Integer>> sector = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            List<Integer> timeMoney = new ArrayList<>();
            timeMoney.add(scanner.nextInt());
            timeMoney.add(scanner.nextInt());
            timeMoney.add(scanner.nextInt());
            timeMoney.add(scanner.nextInt());
            sector.add(timeMoney);
        }

        dfs(0, 0, 0);

        System.out.print(result);
    }

    private static void dfs(int level, int time, int money) {
        if (time > k) {
            return;
        }

        if (level == n) {
            result = Math.max(result, money);
        } else {
            dfs(level + 1, time + sector.get(level).get(0),
                    money + sector.get(level).get(1));

            dfs(level + 1, time + sector.get(level).get(2),
                    money + sector.get(level).get(3));
        }
    }
}
