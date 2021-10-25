package com.divya.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {

    private static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        Node node = new Node(item);

        if(isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        Node node = new Node(item);

        if(isEmpty()) {
            first = last = node;
        } else {

            /*Node temp = first;
            first = node;
            first.next = temp;*/

            node.next = first;
            first = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return  first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        /*boolean isContain = false;
        Node current = first;
        while(current != null) {
            if(current.value == item) return true;
            current = current.next;
        }
        return false;*/
        return  indexOf(item) != -1;
    }

    public void removeFirst() {
        // [10 -> 20 -> 30]
        size--;
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last) {
            first = last = null;
            return;
        }
        Node second = first.next;
        first.next = null;
        first = second;


    }

    public void removeLast() {
        size--;
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last) {
            first = last = null;
            return;
        }
        Node previous = getPrevious(last);
//        previous.next = null;
        last = previous;
        last.next = null;

    }

    private Node getPrevious(Node node) {
        Node current = first;
        while(current != null) {
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size() {

        //This is not effective since we traverse the entire list
        /*int size = 1;
        Node current = first;
        while(current != null) {
            if(current.next == null) return size;
            current = current.next;
            size++;
        }
        return -1;*/
        return size;
    }

    public void reverse() {

        if(isEmpty()) return;
        Node curr = first;
        Node prev = null;
        Node nex;
        while(curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        first = prev;
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node current = first;
        int index = 0;
        while(current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return  array;
    }

    public int kthNodeFromEnd(int k) {
        Node fast = first;
        Node slow = first;
        int distance = k - 1;
        int steps = 0;

        if(isEmpty())
            throw  new IllegalStateException();

        while (distance != steps) {
            fast = fast.next;
            if(fast == null) {
                throw new IllegalArgumentException();
            }
            steps++;
        }
//        System.out.println(steps + "" + fast.value);
        while(fast != last) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.value;
    }

    public int removeKthNodeFromEnd(int k) {
        Node fast = first;
        Node slow = first;

        for(int i=0;i<k;i++) {
            if(slow.next == null) {
                if(i==k-1) first = first.next;
                return first.value;
            }
            if(fast.next == null) {
                first = first.next;
                return first.value;
            }
            fast = fast.next;
            System.out.println("hello in for");
        }


        while (fast.next != null) {
            System.out.println("hello in while");
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return first.value;
    }

    public void printMiddle() {
        Node fast = first;
        Node slow = first;
        while((fast != last) && (fast.next != last) ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == last) {
            System.out.println(slow.value);
        } else
            System.out.println(slow.value + " " + slow.next.value);
    }

}
