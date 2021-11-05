package com.itvillage.lecture.algroithm_with_python.section02;

import java.util.*;

/**
 * K 번째 큰 수 찾기
 */
public class Section02Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int m = j + 1; m < n; m++) {
                    set.add(arr[i] + arr[j] + arr[m]);
                }
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list.get(k - 1));
    }
}
