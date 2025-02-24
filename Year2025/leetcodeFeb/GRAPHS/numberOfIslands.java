package GRAPHS;

import java.util.*;

import java.util.LinkedList;
import java.util.Queue;

public class numberOfIslands {
    static class Pair {
        int first;
        int sec;
        public Pair(int first, int sec) {
            this.first = first;
            this.sec = sec;
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    cnt++;
                    bfs(grid, vis, i, j);
                }
            }
        }
        return cnt;
    }

    void bfs(char[][] grid, boolean[][] vis, int row, int col) {
        int n = grid.length, m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));
        vis[row][col] = true;

        // Define 4 possible movements (left, right, up, down)
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.first;
            int c = p.sec;

            for (int i = 0; i < 4; i++) {
                int newR = r + dRow[i];
                int newC = c + dCol[i];

                if (newR >= 0 && newR < n && newC >= 0 && newC < m &&
                    !vis[newR][newC] && grid[newR][newC] == '1') {
                    vis[newR][newC] = true;
                    q.add(new Pair(newR, newC));
                }
            }
        }
    }
}

