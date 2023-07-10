package com.Himraj;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 20, 54, 30, 9},
                {55, 90, 12, 3},
                {8, 5, 4, 0},
                {123, 500, 320, 55, 991},
                {11, 5, 7}
        };
        int target = 55;
        int[] ans = search(numbers, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
