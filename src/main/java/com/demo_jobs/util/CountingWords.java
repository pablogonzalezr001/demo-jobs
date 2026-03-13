package com.demo_jobs.util;

public class CountingWords {

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(countingWords(str));
    }

    private static int countingWords(String str) {
        return str.trim().split("\\s+").length;
    }
}
