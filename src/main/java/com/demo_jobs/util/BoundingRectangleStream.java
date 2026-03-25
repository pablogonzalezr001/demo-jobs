package com.demo_jobs.util;

import java.util.Arrays;
import java.util.List;

public class BoundingRectangleStream {

    public static List<Integer> boundingRectangle(List<List<Integer>> points) {

        if (points == null || points.size() < 2) {
            throw new IllegalArgumentException("At least 2 points are required");
        }

        int minX = points.stream().mapToInt(List::getFirst).min().orElseThrow();
        int maxX = points.stream().mapToInt(List::getFirst).max().orElseThrow();
        int minY = points.stream().mapToInt(p -> p.get(1)).min().orElseThrow();
        int maxY = points.stream().mapToInt(p -> p.get(1)).max().orElseThrow();

        return List.of(
                minX,
                minY,
                maxX - minX,
                maxY - minY
        );
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
