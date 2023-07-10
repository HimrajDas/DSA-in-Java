package com.Himraj;

public class BS {
    public static void main(String[] args) {
        int[] arr = {2, 10, 16, 20, 25, 30, 36, 40, 46, 50};
        int target = 46;
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) start = mid + 1;
            else if (target < arr[mid]) end = mid - 1;
            else return mid;
        }

        return -1;
    }
}
