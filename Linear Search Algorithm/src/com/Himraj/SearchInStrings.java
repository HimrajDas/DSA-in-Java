package com.Himraj;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {

        String name = "himraj das";
        char target = 'r';
        // System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean search(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean search2(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for(char ch : name.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
