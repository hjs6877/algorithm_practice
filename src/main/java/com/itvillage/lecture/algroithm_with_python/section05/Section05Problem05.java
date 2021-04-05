package com.itvillage.lecture.algroithm_with_python.section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 공주 구하기
 */
public class Section05Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        int i = 0;
        while (q.size() > 1) {
            int num = q.poll();
            i++;
            if (i != k) {
                q.offer(num);
            } else {
                i = 0;
            }
        }

        System.out.print(q.poll());
    }
}
