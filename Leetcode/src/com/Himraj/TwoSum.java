package com.Himraj;
import java.util.Arrays;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] numbs = {3, 2, 3};
        int target = 6;
        System.out.println(sum(numbs, target));
    }

//    static int[] sum(int[] arr, int target) {
//        int firstIndex = 0;
//        int secondIndex = 1;
//        while (secondIndex <= arr.length - 1) {
//            int sum = arr[firstIndex] + arr[secondIndex];
//            if (sum == target) {
//                return new int[]{firstIndex, secondIndex};
//            }
//            if (sum != target) {
//                firstIndex++;
//                secondIndex++;
//            }
//        }
//
//        return new int[]{-1, -1};
//    }

    static int[] sum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
