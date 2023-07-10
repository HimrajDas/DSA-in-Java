package com.Himraj;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 10, 8, 22, 45, 48, 60, 78, 80};
        int target = 46;
        System.out.println(floorNumber(arr, target));
    }

    static int floorNumber(int[] arr, int target) {
        if (target > arr[arr.length - 1]) return -1;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return end;
    }
}
