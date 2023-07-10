package com.Himraj;

public class Practice {
    static int sum = 0;
    static void rev1(int n) {
        if (n == 0) return;
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }

    static int rev2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        // This is for rev2 fn.
        if (n % 10 == n) return n;
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static int countZero(int n) {
        return helper1(n, 0);
    }

    private static int helper1(int n, int c) {
        // This is for countZero fn.
        if (n == 0) return c;
        int rem = n % 10;
        if (rem == 0) return helper1(n / 10, c + 1);
        return helper1(n / 10, c);
    }

    static int steps(int num) {
        return helper2(num, 0);
    }

    static int helper2(int num, int steps) {
        // This is for steps fn.
        if (num == 0) return steps;
        if (num % 2 == 0) return helper2(num / 2, steps + 1);
        return helper2(num - 1, steps + 1);
    }


    public static void main(String[] args) {
        int s = steps(41);
        System.out.println(s);
    }

}
