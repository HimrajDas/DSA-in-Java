package com.Himraj;

// TODO: Learn Binary search algo.

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-4, -2, 0, 2, 10, 25, 55, 60, 62, 86, 88, 90, 95, 100};  // sorted
        int target = 62;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index.
    // return -1 if it doesn't exist.
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element.
            // int mid = (start + end) / 2;  but may be possible that (start + end) exceeds the range of int in java.
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}