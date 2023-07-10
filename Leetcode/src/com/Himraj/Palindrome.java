package com.Himraj;

// https://leetcode.com/problems/palindrome-number/
public class Palindrome {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));

    }

    static boolean isPalindrome(int x) {
        if (x == revNumber(x)) {
            return true;
        } else {
            return false;
        }
    }

    static int revNumber(int x) {
        int revX = 0;
        while (x > 0) {
            int reminder = x % 10;
            x /= 10;
            revX = revX * 10 + reminder;
        }
        return revX;
    }

    // Better version
    static boolean isPalindrome2(int x) {
        int rev=0;
        int y=x;
        while(x>0){
            rev = rev*10+x%10;
            x/=10;
        }
        if(y==rev){
            return true;
        }else{
            return false;
        }
    }
}
