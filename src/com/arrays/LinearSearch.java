package com.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 1};
        System.out.println(searchTarget(arr, 6));
    }

    //search the target and return the element
    static int searchTarget(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for(int ele : arr) {
            if(ele == target) {
                return ele;
            }
        }

        return -1;

    }

    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for(int i=0; i<arr.length; i++) {
            int ele = arr[i];
            if(ele == target) {
                return i;
            }
        }

        return -1;
    }
}
