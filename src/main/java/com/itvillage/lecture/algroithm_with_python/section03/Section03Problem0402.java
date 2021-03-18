package com.itvillage.lecture.algroithm_with_python.section03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * 리스트 합치기
 */
public class Section03Problem0402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        int p1 = 0, p2 = 0;
        List<Integer> results = new ArrayList<>();

        while (p1 < n && p2 < m) {
            if (arr1[p1] <= arr2[p2]) {
                results.add(arr1[p1]);
                p1++;
            } else {
                results.add(arr2[p2]);
                p2++;
            }
        }

        if (p1 < n) {
            results.addAll(Arrays.stream(arr1).boxed().skip(p1).collect(toList()));
        } else if (p2 < m) {
            results.addAll(Arrays.stream(arr2).boxed().skip(p2).collect(toList()));
        }

        for (int r : results) {
            System.out.print(r + " ");
        }
    }
}
