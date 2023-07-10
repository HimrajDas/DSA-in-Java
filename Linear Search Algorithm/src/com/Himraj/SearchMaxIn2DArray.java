package com.Himraj;

import java.util.Arrays;

public class SearchMaxIn2DArray {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 20, 54, 30, 9},
                {55, 90, 12, 3},
                {8, 5, 4, 0},
                {123, 500, 320, 55, 991},
                {11, 5, 7}
        };

        System.out.println(search(numbers));
    }

    static int search(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
