package com.Himraj;

public class BubbleSort {
    public static void main(String[] args) {

    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int tempVar = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tempVar;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
}
