package com.demo_jobs.util;

public class ReverseString {

    public static void main() {
        String str = "Hello World";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
