package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */


//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows


//        input
        Scanner in = new Scanner(System.in);

        for(int i=0;i<arr.length;i++) {
            for(int col=0; col<arr[i].length; col++) {
                arr[i][col] = in.nextInt();
            }
        }

//        output
//        for(int i=0;i<arr.length;i++) {
//            for(int col=0; col<arr[i].length; col++) {
//                System.out.print(arr[i][col] + " ");
//            }
//            System.out.println();
//        }

        //        output
        for(int i=0;i<arr.length;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
