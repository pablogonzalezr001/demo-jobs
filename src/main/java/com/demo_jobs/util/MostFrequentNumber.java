package com.demo_jobs.util;

public class MostFrequentNumber {

    public static void main(String[] args) {
        int[] nums = {1,2,3,2,4,1,2};
        System.out.println(mostFrequentNumber(nums));
    }

    private static int mostFrequentNumber(int[] nums) {
        int maxCount = 0;
        int mostFrequent = nums[0];

        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                mostFrequent = nums[i];
            }
        }
        return mostFrequent;
    }
}
