package com.Himraj.Arrays;

import java.util.ArrayList;

public class FindTarget {
    public static void main(String[] args) {

    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) return false;
        return arr[index] == target || find(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) return list;
        if (arr[index] == target) list.add(index);
        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (index == arr.length) return list;

        // this will contain answer for that function call only.
        if (arr[index] == target) list.add(index);

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
