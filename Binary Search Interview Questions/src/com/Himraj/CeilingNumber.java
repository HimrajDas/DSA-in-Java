package com.Himraj;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 10, 25, 32, 44, 45, 49, 55, 58, 60};
        int target = 48;
        System.out.println(ceilingNumber(arr, target));
    }

    static int ceilingNumber(int[] arr, int target) {
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
        return start;
    }
}