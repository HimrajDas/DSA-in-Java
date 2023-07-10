package com.Himraj;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 2, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correctIndex) {
        int tempVar = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = tempVar;
    }
}
