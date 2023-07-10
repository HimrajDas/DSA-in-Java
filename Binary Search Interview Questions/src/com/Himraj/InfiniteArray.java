package com.Himraj;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 10, 15, 16, 18, 20, 30, 35, 38, 40, 55, 60, 78, 80, 85, 90};
        int target = 16;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // first find the range.
        // first start with a box of size 2.
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range.
        while (target > arr[end]) {
            int newStart = end + 1;
            // 2X the box value.
            // end = previous end + sizeOfBox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
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
