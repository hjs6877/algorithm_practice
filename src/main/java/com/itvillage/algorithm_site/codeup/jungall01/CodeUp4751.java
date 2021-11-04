package com.itvillage.algorithm_site.codeup.jungall01;

import java.util.*;

public class CodeUp4751 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Player player = new Player(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            players.add(player);
        }

        Collections.sort(players, (o1, o2) -> {
            if (o1.getPoint() > o2.getPoint()) {
                return -1;
            } else {
                return 1;
            }
        });

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (Player p : players) {
            if (count == 3) break;
            if (map.get(p.getCountry()) == null) {
                System.out.printf("%d %d", p.getCountry(), p.getPlayer());
                System.out.println();
                map.put(p.getCountry(), 1);
                count++;
            } else if (map.get(p.getCountry()) < 2) {
                System.out.printf("%d %d", p.getCountry(), p.getPlayer());
                System.out.println();
                map.put(p.getCountry(), map.get(p.getCountry()) + 1);
                count++;
            }

        }
    }

    private static class Player {
        int country;
        int player;
        int point;

        public Player(int country, int player, int point) {
            this.country = country;
            this.player = player;
            this.point = point;
        }

        public int getCountry() {
            return country;
        }

        public int getPlayer() {
            return player;
        }

        public int getPoint() {
            return point;
        }
    }
}
