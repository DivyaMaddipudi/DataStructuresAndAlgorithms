package com.divya.linkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println(list.kthNodeFromEnd(-1));

//        list.addFirst(10);
//        list.addFirst(20);
//        list.addFirst(30);


//        list.removeLast();
//        System.out.println(list.size());

//        list.addFirst(40);
//        list.addFirst(30);
//        System.out.println(list.size());

//        list.removeFirst();

//        System.out.println(list.size());

//        int[] array = list.toArray();
//        System.out.println(Arrays.toString(array));

//        list.reverse();
//
//        int[] array1 = list.toArray();
//        System.out.println(Arrays.toString(array1));

//        System.out.println(list.contains(10));

    }
}
