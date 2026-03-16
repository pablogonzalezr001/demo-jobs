package com.demo_jobs.util;

import java.util.Arrays;
import java.util.List;

public class PeaksSolution {

    /*
    when the value is 5 units higher than its two neighbors its a "top peak"
    when the value is 5 units lower than its two neighbors its a "bottom peak"
    you must return and integer:total numbers of top and bottom peaks
     */
     public static int countPeaks(List<Double> peaks ) {
        int count = 0;

        for (int i = 1; i < peaks.size() - 1; i++) {
            double current = peaks.get(i);
            double left = peaks.get(i - 1);
            double right = peaks.get(i + 1);

            if (current >= left + 5 && current >= right + 5) {
                count++; // Top peak
            } else if (current <= left - 5 && current <= right - 5) {
                count++; // Bottom peak
            }
        }

        return count;
     }

     public static void main(String[] args) {
        List<Double> peaks = Arrays.asList(10.0, 15.0, 5.0, 20.0, 10.0);
        System.out.println(countPeaks(peaks)); // Output: 2
     }
}
