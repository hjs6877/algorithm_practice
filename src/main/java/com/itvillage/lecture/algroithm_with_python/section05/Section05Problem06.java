package com.itvillage.lecture.algroithm_with_python.section05;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 응급실
 */
public class Section05Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Patient[] p = new Patient[n];
        Queue<Patient> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            p[i] = new Patient(i, scanner.nextInt());
            q.offer(p[i]);
        }

        int count = 0;
        while (!q.isEmpty()) {
            Patient patient = q.poll();
            if (q.stream().anyMatch(qPatient -> qPatient.risk > patient.risk)) {
                q.offer(patient);
            } else {
                count++;
                if (patient.num == m) {
                    System.out.print(count);
                    break;
                }
            }
        }
    }
}

class Patient {
    public int num;
    public int risk;

    public Patient(int num, int risk) {
        this.num = num;
        this.risk = risk;
    }
}
