package com.demo_jobs.util;

import java.util.HashMap;
import java.util.Map;

public class CountingFrequency {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3,4};
        System.out.println(countingFrequency(nums));
    }

    private static String countingFrequency(int[] nums) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }
        return frequencyMap.toString();
    }
}
