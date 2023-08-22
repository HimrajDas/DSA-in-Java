package com.Himraj.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(2, 2));
        // path("", 3, 3);
        // System.out.println(returnPath("", 3, 3));
        // System.out.println(returnPathDiagonal("", 3, 3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathRestrictions("", board, 0, 0);
    }

    static int count(int row, int col) {
        if (row == 1 || col == 1) return 1;
        int left = count(row - 1, col);
        int right = count(row, col - 1);
        return left + right;
    }


    static void path(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) {
            path(p + 'D', row - 1, col);
        }

        if (col > 1) {
            path(p + 'R', row, col - 1);
        }
    }

    static ArrayList<String> returnPath(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1) {
            list.addAll(returnPath(p + 'D', row - 1, col));
        }

        if (col > 1) {
            list.addAll(returnPath(p + 'R', row, col - 1));
        }

        return list;
    }


    static ArrayList<String> returnPathDiagonal(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();


        if (row > 1 && col > 1) {
            list.addAll(returnPathDiagonal(p + 'D', row - 1, col - 1));
        }

        if (row > 1) {
            list.addAll(returnPathDiagonal(p + 'V', row - 1, col));
        }

        if (col > 1) {
            list.addAll(returnPathDiagonal(p + 'H', row, col - 1));
        }

        return list;
    }


    static void pathRestrictions(String p, boolean[][] maze, int row, int col) {
        // obstacle in some cells.
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) return;

        if (row < maze.length - 1) {
            pathRestrictions(p + 'D', maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, row, col + 1);
        }

    }

    

}
