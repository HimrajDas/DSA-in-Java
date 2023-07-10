package com.Himraj;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

    }

    static int[] binarySearch(int[][] matrix, int target, int row, int colStart, int colEnd) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] > target) colStart = mid + 1;
            else if (matrix[row][mid] < target) colEnd = mid - 1;
            else return new int[]{row, mid};
        }

        return new int[]{-1, -1};
    }


    static int[][] search(int[][] matrix, int target) {

    }
}
