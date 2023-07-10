package com.Himraj.Level_1_Questions;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(nFactorial(5));
    }

    static int nFactorial(int n) {
        if (n == 1) return 1;
        // int currentValue = n;
        return n * nFactorial(n - 1);
    }
}
