package com.Himraj;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 34, -2, 22, 100, 98, 45, 0, -123, 93};
        int target = -123;
        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop.
        for (int index = 0; index < arr.length; index++) {
            // check for element in every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}