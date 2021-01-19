package com.itvillage.book.this_is_coding_test.part2.chapter06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Chapter06Problem03 {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            String name = scanner.next();
            int point = scanner.nextInt();

            studentList.add(new Student(name, point));
        }

        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.print(student.getName() + " ");
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int point;

    public Student(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public int compareTo(Student other) {
        if (this.getPoint() < other.getPoint()) {
            return -1;
        }
        return 1;
    }
}
