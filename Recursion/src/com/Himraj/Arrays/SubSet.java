package com.Himraj.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for (List<Integer> list : ans) System.out.println(list);
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        for (int num : arr) {
            int n = outerList.size();
            for (int i = 0; i < n; i++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(i));
                innerList.add(num);
                outerList.add(innerList);
            }
        }
        return outerList;
    }


    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, start = end + 1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start  = end + 1;
            }
            end = outerList.size() - 1;
            int n = outerList.size();
            for (int j = 0; j < n; j++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(j));
                innerList.add(arr[i]);
                outerList.add(innerList);
            }
        }
        return outerList;
    }
}
