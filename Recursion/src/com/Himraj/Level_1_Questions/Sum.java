package com.Himraj.Level_1_Questions;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sumOfN(5));
    }

    static int sumOfN(int n) {
        if (n == 1) return 1;
        return n + sumOfN(n - 1);
    }
}
