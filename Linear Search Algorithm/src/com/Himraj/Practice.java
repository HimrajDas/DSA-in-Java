package com.Himraj;

public class Practice {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 20, 54, 30, 9},
                {55, 90, 12, 3},
                {8, 5, 4, 0},
                {123, 500, 320, 55, 991},
                {11, 5, 7}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}

