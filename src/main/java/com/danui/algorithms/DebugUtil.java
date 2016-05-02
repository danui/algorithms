package com.danui.algorithms;

public class DebugUtil {

    public static void show(int[][] d) {
        if (d.length == 0) return;
        if (d[0].length == 0) return;

        // Find column width
        int k = 0;
        for (int i = 0; i < d.length; ++i) {
            for (int j = 0; j < d[0].length; ++j) {
                int w = String.format("%d", d[i][j]).length();
                if (k < w) {
                    k = w;
                }
            }
        }

        String fmt = " %"+k+"d";
        for (int i = 0; i < d.length; ++i) {
            for (int j = 0; j < d[0].length; ++j) {
                System.out.format(fmt, d[i][j]);
            }
            System.out.format("%n");
        }

        System.out.flush();
    }

}
