package com.demo_jobs.util;

import java.util.HashSet;
import java.util.Set;

public class ValidSquare_ {

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>();

        int[][] pts = {p1, p2, p3, p4};

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                int[] a0 = pts[i];
                int[] a1 = pts[j];
                int d = dist(a0, a1);
                if (d == 0) return false;
                set.add(d);
            }
        }

        return set.size() == 2;
    }

    private int dist(int[] a, int[] b) {
        int r0 = a[0] - b[0];
        int r1 = a[1] - b[1];
        return (r0)*(r0) + (r1)*(r1);
    }

    public static void main(String[] args) {
        ValidSquare_ vs = new ValidSquare_();
        int[] p1 = {0, 0}, p2 = {1, 0}, p3 = {1, 1}, p4 = {0, 1};
        System.out.println(vs.validSquare(p1, p2, p3, p4)); // Output: true
    }
}
