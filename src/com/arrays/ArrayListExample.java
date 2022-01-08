package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(67);
        list.add(77);
        list.add(97);
        list.add(7);
        list.add(86);
        list.add(90);
        list.add(44);

        System.out.println(list.contains(44));
        list.set(0, 743);
        list.remove(2);
        System.out.println(list);

        //get an item
        System.out.println(list.get(2));


    }
}
