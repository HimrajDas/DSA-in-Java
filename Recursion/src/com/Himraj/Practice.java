package com.Himraj;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        System.out.println(subsequence("", "abcf"));
    }


    static ArrayList<String> subsequence(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subsequence(p + ch, up.substring(1));
        ArrayList<String> right = subsequence(p, up.substring(1));
        left.addAll(right);

        return left;
    }

}
