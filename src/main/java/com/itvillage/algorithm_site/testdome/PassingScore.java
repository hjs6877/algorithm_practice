package com.itvillage.algorithm_site.testdome;

import java.util.stream.*;
import java.util.*;

public class PassingScore {
    public static class Student implements Comparable<Student> {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Student o) {
            return Integer.compare(o.getScore(), this.getScore());
        }
    }

    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {
        List<String> names = students
                .filter(student -> student.getScore() >= passingScore)
                .sorted().map(student -> student.getName()).collect(Collectors.toList());

        return names;
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Mike", 80));
        students.add(new Student("James", 57));
        students.add(new Student("Alan", 21));

        studentsThatPass(students.stream(), 50).forEach(System.out::println);
    }
}
