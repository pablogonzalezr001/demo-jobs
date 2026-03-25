package com.demo_jobs.util;

import java.util.Arrays;
import java.util.List;

public class BoundingRectangle {

    public static List<Integer> boundingRectangle(List<List<Integer>> coordinatesPoints) {

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (List<Integer> point : coordinatesPoints) {
            int x = point.get(0);
            int y = point.get(1);

            if (x < minX) minX = x;
            if (y < minY) minY = y;
            if (x > maxX) maxX = x;
            if (y > maxY) maxY = y;
        }

        int width = maxX - minX;
        int height = maxY - minY;

        return Arrays.asList(minX, minY, width, height);
    }

    public static void main(String[] args) {
        List<List<Integer>> coordinatesPoints = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        System.out.println(boundingRectangle(coordinatesPoints));
    }
}
