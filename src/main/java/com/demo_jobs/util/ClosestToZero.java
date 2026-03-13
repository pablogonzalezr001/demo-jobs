package com.demo_jobs.util;

public class ClosestToZero {

    public static int closestToZero(int[] nums) {
        int closest = Integer.MAX_VALUE;

        for (int n : nums) {
            int num = Math.abs(n);
            int closestAbs = Math.abs(closest);
            if (Math.abs(n) < Math.abs(closest) || (Math.abs(n) == Math.abs(closest) && n > closest)) {
                closest = n;
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 4, -1};
        System.out.println(closestToZero(nums));
    }
}
