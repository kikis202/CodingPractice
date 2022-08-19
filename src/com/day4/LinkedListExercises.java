package com.day4;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExercises {
    public static void main(String[] args) {
        // Write a Java program to append the specified element to the end of a linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");
        linkedList.add("Yellow");
        linkedList.add("Cyan");
        linkedList.add("Magenta");
        linkedList.add("White");
        linkedList.add("Black");
        System.out.println(linkedList);
        System.out.println();
        // Write a Java program to iterate through all elements in a linked list starting at the specified position
        Iterator<String> it = linkedList.listIterator(2);
        while (it.hasNext()) {
            System.out.printf("%s ", it.next());
        }
        System.out.printf("%n%n");
        // Write a Java program to remove all the elements from a linked list
        linkedList.clear();
        System.out.println(linkedList);

    }
}
