package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.Scanner;

public class CodeUp4011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String year = s.substring(0, 2);
        String month = s.substring(2, 4);
        String day = s.substring(4, 6);
        String gender = s.substring(7, 8);

        year = gender.equals("1") || gender.equals("2") ? "19" + year : "20" + year;
        gender = gender.equals("1") || gender.equals("3") ? "M" : "F";



        System.out.printf("%s/%s/%s %s", year, month, day, gender);
    }
}
