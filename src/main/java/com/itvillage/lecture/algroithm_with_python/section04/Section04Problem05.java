package com.itvillage.lecture.algroithm_with_python.section04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 회의실 배정
 */
public class Section04Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Meeting[] arr = new Meeting[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Meeting(scanner.nextInt(), scanner.nextInt());
        }

        Arrays.sort(arr);

        int e = arr[0].getE();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            int s = arr[i].getS();
            if (s >= e) {
                e = arr[i].getE();
                count++;
            }
        }

        System.out.println(count);
    }
}

class Meeting implements Comparable<Meeting> {
    int s;
    int e;

    public Meeting(int s, int e) {
        this.s = s;
        this.e = e;
    }

    public int getS() {
        return s;
    }

    public int getE() {
        return e;
    }

    @Override
    public int compareTo(Meeting m) {
        return this.getE() - m.getE();
    }
}
