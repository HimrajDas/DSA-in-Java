package com.Himraj;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 4;
        int[] ans = search(matrix, target);
        System.out.println(Arrays.toString(ans));
    }


    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) return new int[]{row, mid};

            if (target < matrix[row][mid]) cEnd = mid - 1;
            else cStart = mid + 1;
        }

        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 1) return binarySearch(matrix, 0, 0, cols - 1, target);

        int rStart = 0;
        int rEnd = rows - 1;
        int colMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][colMid] == target) return new int[] {mid, colMid};
            if (target < matrix[mid][colMid]) rEnd = mid;
            else rStart = mid;
        }

        if (matrix[rStart][colMid] == target) return new int[] {rStart, colMid};
        if (matrix[rStart + 1][colMid] == target) return new int[] {rStart + 1, colMid};

        // search in 1st half.
        if (target <= matrix[rStart][colMid - 1]) return binarySearch(matrix, rStart, 0, colMid - 1, target);

        // search in the 2nd half.
        if (target >= matrix[rStart][colMid + 1] && target <= matrix[rStart][cols - 1]) return binarySearch(matrix, rStart, colMid + 1, cols - 1, target);

        // search in the 3rd half.
        if (target <= matrix[rStart + 1][colMid - 1]) return binarySearch(matrix, rStart + 1, 0, colMid - 1, target);

        // search in the 4th half.
        if (target >= matrix[rStart + 1][colMid + 1]) return binarySearch(matrix, rStart + 1, colMid + 1, cols - 1, target);

        return new int[] {-1, -1};
    }
}
