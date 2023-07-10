package com.Himraj;

public class Fibonacci {
    public static void main(String[] args) {
//        for (int i = 0; i < 11; i++) {
//            System.out.println(fibFormula(i));
//        }

        System.out.println(fibFormula(50));
    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static long fibFormula(int n) {
        // ((1 + Math.sqrt(5)) / 2), n
        return (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

}