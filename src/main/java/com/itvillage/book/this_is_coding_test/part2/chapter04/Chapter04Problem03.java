package com.itvillage.book.this_is_coding_test.part2.chapter04;

import java.util.Scanner;

public class Chapter04Problem03 {
    public static int n, m, x, y, direction;
    public static int[][] d = new int[50][50];
    public static int[][] map = new int[50][50];
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        x = scanner.nextInt();
        y = scanner.nextInt();
        direction = scanner.nextInt();
        d[x][y] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        int count = 1;
        int turnCount = 0;

        while (true) {
            // 왼쪽으로 회전한다.
            turnLeft();
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            // 회전 후, 정면에 있는 칸이 육지(0)이고, 가보지 않은 칸이면 1칸 전진한다.
            if (map[nx][ny] == 0 && d[nx][ny] == 0) {
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                count++;
                turnCount = 0;

                continue;
            } else { // 방문한 칸이거나 육지가 아니라면, turnCount++ 하고 다시 while 처음부터
                turnCount++;

                // turnCount가 4일 경우
                if (turnCount == 4) {
                    nx = x - dx[direction];
                    ny = x - dy[direction];

                    // 뒤로 물러날 수 있다면 한칸 뒤로 물러난 후, while 처음 부터
                    if (map[nx][ny] == 0) {
                        x = nx;
                        y = ny;
                    } else { // 뒤가 바다로 막혀 있어서 뒤로 물러날 수 없다면 break
                        break;
                    }
                    turnCount = 0;
                }
            }
        }

        System.out.println(count);
   }

    private static void turnLeft() {
        direction--;
        if(direction == -1)
            direction = 3;
    }
}
