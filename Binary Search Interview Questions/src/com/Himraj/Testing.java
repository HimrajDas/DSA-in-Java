package com.Himraj;

public class Testing {
    public static void main(String[] args) {

    }


    static int search(int[] numbs, int target) {
        int pivot = findPivot(numbs);
        if (pivot == -1) return binarySearch(numbs, target, 0, numbs.length - 1);
        if (numbs[pivot] == target) return pivot;
        if (target >= numbs[0]) return binarySearch(numbs, target, 0, pivot - 1);
        return binarySearch(numbs, target, pivot + 1, numbs.length - 1);
    }


    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) start = mid + 1;
            else if (target < arr[mid]) end = mid - 1;
            else return mid;
        }

        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;
            if (arr[mid] <= arr[start]) end = mid - 1;
            else start = mid + 1;
        }

        return -1;
    }
}
