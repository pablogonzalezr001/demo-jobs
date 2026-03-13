package com.demo_jobs.util;

public class LogParser {

    public static int sumTransactions(String logs){

        String[] lines = logs.split("\n");
        int total = 0;

        for(String line : lines){

            String[] parts = line.split(":");
            int amount = Integer.parseInt(parts[1]);

            total += amount;
        }

        return total;
    }

    public static void main(String[] args) {

        String logs = "tx1:100\ntx2:200\ntx3:50";

        System.out.println(sumTransactions(logs));
    }
}
