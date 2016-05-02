package com.danui.editdistance;

public class EditDistance {

    public static int solve(String s, String t) {
        return solve(s.toCharArray(), t.toCharArray());
    }

    public static int solve(char[] s, char[] t) {
        int m = s.length;
        int n = t.length;
        // System.out.format("m=%d n=%d%n", m, n);
        if (m == 0) return n;
        if (n == 0) return m;
        Grid grid = new Grid(m, n);
        return 3;
    }

    private static class Grid {
        private int[][] distances;
        public Grid(int m, int n) {
            distances = new int[m][n];
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    distances[i][j] = 0;
                }
            }
        }
    }

}
