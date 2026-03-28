package com.demo_jobs.util;

public class Blank {

    private  static int[][] numsWinners8 (int[][] numsA, int[][] numsB) {
        int[][] result = new int[numsA.length][numsB.length];
        System.out.println("###############################################################################################");
        System.out.println("numsA length: " + numsA.length);
        System.out.println("numsB length: " + numsB.length);
        for (int i = 0; i < numsA.length ; i++) {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("i: "+i);
            System.out.println("numsB[0]: "+numsB[0].length);
            for (int j = 0; j < numsB[0].length; j++) {
                System.out.println("j: "+j);
                System.out.println("numsA["+i+"]["+j+"]: "+ numsA[i][j] + " - numsB["+i+"]["+j+"]: " + numsB[i][j]);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("This is a blank class");
        int[][] numsA = new int[][]{{1,2},{3,4},{5,6},{7,8}};
        int[][] numsB = new int[][]{{7,4},{3,7},{3,9},{9,9}};
        numsWinners8(numsA, numsB);
    }
}
