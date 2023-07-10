package com.Himraj;

public class SearchInRange {
    public static void main(String[] args) {
        int[] numbers = {12, 60, 55, -20, 65, 100, -32, 10, 322, 89};
        int target = 65;
        System.out.println(linearSearch(numbers, target,0, 3));
    }

    static int linearSearch(int[] arr, int target, int start, int stop) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= stop ; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;
    }
}
