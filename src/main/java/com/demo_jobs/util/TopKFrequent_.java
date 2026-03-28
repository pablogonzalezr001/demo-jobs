package com.demo_jobs.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent_ {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
                (a, b) -> freq.get(a) - freq.get(b)
        );

        for (int num : freq.keySet()) {
            heap.offer(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        return heap.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        TopKFrequent_ topKFrequent = new TopKFrequent_();
        int[] nums = {1,1,1,2,2,3,4,5,6,7,8,9};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent.topKFrequent(nums, k)));
    }
}
