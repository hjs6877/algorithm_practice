package com.itvillage.algorithm_site.codility;

import java.lang.reflect.Array;
import java.util.*;

public class SampleTask {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 4, 1, 2};
        int result = solution(a);

        System.out.println(result);
    }

    public static int solution(int[] A) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }
}
