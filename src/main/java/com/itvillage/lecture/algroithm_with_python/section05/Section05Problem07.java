package com.itvillage.lecture.algroithm_with_python.section05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 교육 과정 설계
 */
public class Section05Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rqs = scanner.next();
        int n = scanner.nextInt();
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = scanner.next();
        }


        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new HashMap<>();
            String result = "YES";
            for (int j = 0; j < rqs.length(); j++) {
                char rq = rqs.charAt(j);
                int rqIdx = ss[i].indexOf(rq);

                if (map.isEmpty()) {
                    map.put("rq", rqIdx);
                } else {
                    if (map.get("rq") > rqIdx) {
                        result = "NO";
                        break;
                    } else {
                        map.put("rq", rqIdx);
                    }
                }
            }
            System.out.println(result);
        }

    }
}
