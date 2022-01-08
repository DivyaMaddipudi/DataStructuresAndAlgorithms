package com.arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 6, 5};
        System.out.println(maxRange(arr, 3, 5));

    }

    static int max(int arr[]) {
        int max = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int arr[], int start, int end) {

        if(end > start || arr.length==0 ) {
            return -1;
        }
        int max = arr[start];
        for(int i=start;i<end;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
