package com.arrays;

public class Sample {
    public static void main(String[] args) {
        int[][] image = {{1,0,0,1,0,1},{0,0,1,0,1,1},{1,1,0,0,0,0},{1,0,0,1,1,0},{0,1,0,0,0,0},{1,0,1,1,0,0}};
        for(int i=0; i<image.length; i++) {
            int n = image[i].length-1;
            int size = n;
            for(int j=0; j<=n/2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][size];
                image[i][size] =  temp;
                size--;
            }

        }
        System.out.println("After");

        for(int i=0;i<image.length;i++) {
        for(int j=0;j<image[i].length;j++) {

            System.out.print(image[i][j]);

        }
        System.out.println();

    }
    }
}
