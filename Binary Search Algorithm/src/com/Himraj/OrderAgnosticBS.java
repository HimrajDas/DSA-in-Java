package com.Himraj;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {-4, -2, 0, 2, 10, 25, 55, 60, 62, 86, 88, 90, 95, 100};  // sorted
        int[] arr = {99, 85, 55, 35, 34, 20, 18, 10, 8, 4, 2, 0, -2, -4, -8};
        int target = -2;
        int ans = orderAgnosticBs(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // find whether the array is in ascending or descending order
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

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
