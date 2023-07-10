package com.Himraj;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {6, 8, 15, 20, 25, 30, 29, 16, 9, 5, 1};
        System.out.println(peakIndexInMountainArray(arr));
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
}
