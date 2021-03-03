package com.itvillage.algorithm_site.programmers.practice.full_search;

import java.util.*;

public class GiveUpMath {
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        int[] result = solution(answers);

        for (int r : result) {
            System.out.print(r + " ");
        }
    }

    public static int[] solution(int[] answers) {
        List<Integer> ids = new ArrayList<>();

        SuPoZa suPoZa01 = new SuPoZa(1);
        SuPoZa suPoZa02 = new SuPoZa(2);
        SuPoZa suPoZa03 = new SuPoZa(3);

        suPoZa01.setPattern(createPattern(answers.length, "12345"));
        suPoZa02.setPattern(createPattern(answers.length, "21232425"));
        suPoZa03.setPattern(createPattern(answers.length, "3311224455"));

        List<SuPoZa> suPoZaList = Arrays.asList(suPoZa01, suPoZa02, suPoZa03);

        for (SuPoZa s : suPoZaList) {
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == Character.getNumericValue(s.getPattern().charAt(j))) {
                    s.setCount(s.getCount() + 1);
                }
            }
        }

        Collections.sort(suPoZaList, (o1, o2) -> {
            if (o1.getCount() > o2.getCount()) {
                return -1;
            } else if (o1.getCount() < o2.getCount()) {
                return 1;
            }
            return 0;
        });

        ids.add(suPoZaList.get(0).getId());
        if (suPoZaList.get(0).getCount() == suPoZaList.get(1).getCount()) {
            ids.add(suPoZaList.get(1).getId());
        }
        if (suPoZaList.get(0).getCount() == suPoZaList.get(2).getCount()) {
            ids.add(suPoZaList.get(2).getId());
        }

        int[] answer = new int[ids.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ids.get(i);
        }
        return answer;
    }

    private static String createPattern(int answers, String pattern) {
        int repeat = answers / pattern.length();
        int n = answers % pattern.length();
        String x = "";
        String y = pattern.substring(0, n);
        for (int i = 0; i < repeat; i++) {
            x += pattern;
        }
        return x + y;
    }
}

class SuPoZa {
    int id;
    String pattern;
    int count;

    public SuPoZa(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
