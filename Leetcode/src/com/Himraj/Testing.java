package com.Himraj;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {


    }

    static int[] sum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }




}
