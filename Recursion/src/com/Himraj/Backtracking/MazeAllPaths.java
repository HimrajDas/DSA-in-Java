package com.Himraj.Backtracking;

import java.util.Arrays;

public class MazeAllPaths {
    public static void main(String[] args) {

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[board.length][board.length];
        // allPathsPrint("", board, 0, 0, path, 1);
        allPaths("", board, 0, 0);
    }

    static void allPaths(String p, boolean[][] maze, int row, int col) {
        // obstacle in some cells.
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) return;

        // I am considering this block in my path.
        maze[row][col] = false;

        if (row < maze.length - 1) {
            allPaths(p + 'D', maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            allPaths(p + 'R', maze, row, col + 1);
        }

        if (row > 0) {
            allPaths(p + 'U', maze, row - 1, col);
        }

        if (col > 0) {
            allPaths(p + 'L', maze, row, col - 1);
        }

        maze[row][col] = true;

    }



    static void allPathsPrint(String p, boolean[][] maze, int row, int col, int[][] path, int step) {
        // obstacle in some cells.
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[row][col]) return;

        // I am considering this block in my path.
        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            allPathsPrint(p + 'D', maze, row + 1, col, path, step + 1);
        }

        if (col < maze[0].length - 1) {
            allPathsPrint(p + 'R', maze, row, col + 1, path, step + 1);
        }

        if (row > 0) {
            allPathsPrint(p + 'U', maze, row - 1, col, path, step + 1);
        }

        if (col > 0) {
            allPathsPrint(p + 'L', maze, row, col - 1, path, step + 1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }

}
