package com.demo_jobs.util;

import java.util.Map;

public class MostFrequentNumberMap {

    public static void main(String[] args) {
        Map<Integer, Integer> map = Map.of(1, 2, 2, 3, 3, 1, 4, 1);
        int[] nums = {1,2,3,2,4,1,2};
        System.out.println(mostFrequentNumber(map));
    }

    private static int mostFrequentNumber(Map<Integer, Integer> map) {
        int maxCount = 0;
        int result = 0;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > maxCount) {
                maxCount = e.getValue();
                result = e.getKey();
            }
        }
        return result;
    }
}
