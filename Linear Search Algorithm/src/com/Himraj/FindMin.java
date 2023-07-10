package com.Himraj;

public class FindMin {
    public static void main(String[] args) {
        int[] numbers = {12, 9, -5, 32, 0};
        System.out.println(min(numbers));
    }

    static int min(int[] arr) {
        int minNum = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < minNum) {
                minNum = arr[index];
            }
        }
        return minNum;
    }
}
