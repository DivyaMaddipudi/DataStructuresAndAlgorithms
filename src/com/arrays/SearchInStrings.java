package com.arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "divya";
        char target = 'm';
        System.out.println(search(name, target));
    }

    static boolean search(String name, char target) {
        if(name.contains(target + "")) {
            return true;
        } else {
            return false;
        }
    }
}
