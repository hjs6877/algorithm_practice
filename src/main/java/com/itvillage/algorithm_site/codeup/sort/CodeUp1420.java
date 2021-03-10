package com.itvillage.algorithm_site.codeup.sort;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student(scanner.next(), scanner.nextInt());
        }

        Arrays.sort(students, (s1, s2) -> s2.point - s1.point);

        System.out.print(students[2].name);
    }
}

class Student {
    public String name;
    public int point;

    public Student(String name, int point) {
        this.name = name;
        this.point = point;
    }
}
