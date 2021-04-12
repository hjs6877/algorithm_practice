package com.itvillage.lecture.algroithm_with_python.section05;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 최소 힙
 */
public class Section05Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            int n = scanner.nextInt();
            list.add(n);
            if (n == -1) {
                break;
            }
        }

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int n : list) {
            if (n == 0) {
                System.out.println(q.poll());
            } else if (n == -1) {
                break;
            } else {
                q.offer(n);
            }
        }
    }
}
