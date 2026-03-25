package com.demo_jobs.util;

import java.util.HashSet;
import java.util.Set;

public class ValidSquare {

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>();

        int[][] pts = {p1, p2, p3, p4};

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                int d = dist(pts[i], pts[j]);
                if (d == 0) return false;
                set.add(d);
            }
        }

        return set.size() == 2;
    }

    private int dist(int[] a, int[] b) {
        int r0 = a[0] - b[0];
        int r1 = a[1] - b[1];
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }

    public static void main(String[] args) {
        ValidSquare vs = new ValidSquare();
        int[] p1 = {0, 0}, p2 = {1, 0}, p3 = {1, 1}, p4 = {0, 1};
        System.out.println(vs.validSquare(p1, p2, p3, p4)); // Output: true
    }
}
