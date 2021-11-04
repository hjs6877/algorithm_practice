package com.itvillage.algorithm_site.testdome;

import java.util.ArrayList;
import java.util.List;

public class Platformer {
    private List<Integer> tiles = new ArrayList<>();
    private int position;
    public Platformer(int n, int position) {
        this.position = position;
        for (int i = 0; i < n; i++) {
            tiles.add(i);
        }

    }

    public void jumpLeft() {
        int index = tiles.indexOf(position);
        position = tiles.get(index - 2);
        tiles.remove(index);
    }

    public void jumpRight() {
        int index = tiles.indexOf(position);
        position = tiles.get(index + 2);
        tiles.remove(index);
    }

    public int position() {
        return this.position;
    }

    public static void main(String[] args) {
        Platformer platformer = new Platformer(6, 3);
        System.out.println(platformer.position()); // should print 3

        platformer.jumpLeft();
        System.out.println(platformer.position()); // should print 1

        platformer.jumpRight();
        System.out.println(platformer.position()); // should print 4

        platformer.jumpLeft();
        System.out.println(platformer.position()); // should print 0
    }
}
