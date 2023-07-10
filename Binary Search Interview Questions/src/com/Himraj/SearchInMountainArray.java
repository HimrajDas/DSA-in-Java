package com.Himraj;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 30, 35, 28, 19, 9, 2, 0};
        int target = 30;
        System.out.println(search(arr, target));

    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBs(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBs(arr, target, peak+1, arr.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // I am in descending order.
                // this may be the ans, but look at left.
                // this is why end != mid -1
                end = mid;
            } else {
                // I am in ascending order.
                start = mid + 1;
            }
        }

        return start;  // start or end bcz both are going to be equal.
    }

    static int orderAgnosticBs(int[] arr, int target, int start, int end) {
        // find whether the array is in ascending or descending order
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
