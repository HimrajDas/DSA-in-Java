package com.Himraj;


import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] numbs = {4, 7, 7, 7, 7, 9, 9, 10};
        int target = 7;
        int[] ans = searchRange(numbs, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchRange(int[] numbs, int target) {
        int[] ans = {-1, -1};
        int start = search(numbs, target, true);
        int end = search(numbs, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] numbs, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = numbs.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < numbs[mid]) {
                end = mid - 1;
            } else if (target > numbs[mid]) {
                start= mid + 1;
            } else {
                // potential answer found.
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
