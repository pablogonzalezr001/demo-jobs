package com.demo_jobs.util;

import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            int complement = target - n;

            if (map.containsKey(complement)) {
                return new int[]{complement, n};
            }

            map.put(n, 1);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}