package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeUp4621 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        if (list.size() == 0 || k - 1 > list.size() - 1) {
            System.out.println(0);
        } else {
            System.out.print(list.get(k - 1));
        }
    }
}
