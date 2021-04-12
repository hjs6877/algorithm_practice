package com.itvillage.lecture.algroithm_with_python.section05;

import java.util.*;

/**
 * 최대 힙
 */
public class Section05Problem11 {
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

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
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
