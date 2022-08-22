package com.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExercises {
    public static void main(String[] args) {
        /// Write a Java program to create a new array list, add some colors (string) and print out the collection
        List<String> listColors = new ArrayList<String>();
        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Yellow");
        listColors.add("Cyan");
        listColors.add("Magenta");
        listColors.add("White");
        listColors.add("Black");
        System.out.println(listColors);
        System.out.println();
        // Write a Java program to iterate through all elements in a array list
        System.out.println("Iterating through array list:");
        Iterator<String> it = listColors.iterator();
        while (it.hasNext()) {
            System.out.printf("%s ", it.next());
        }
        System.out.println();
        System.out.println();
        // Write a Java program to insert an element into the array list at the first position
        System.out.println("Adding item to the front");
        listColors.add(0, "Orange");
        // Write a Java program to retrieve an element (at a specified index) from a given array list
        System.out.println(listColors.get(0));
        System.out.println();
        // Write a Java program to update specific array element by given element
        listColors.set(2, "Gray");
        System.out.println(listColors);
        System.out.println();
        // Write a Java program to remove specific array element by given element
        listColors.remove(2);
        System.out.println(listColors);
        System.out.println();
        // Write a Java program to search an element in a array list
        System.out.printf("Cyan is at index: %d%n%n", listColors.indexOf("Cyan"));
        // Write a Java program to sort a given array list
        Collections.sort(listColors);
        System.out.println(listColors);
        System.out.println();
        //Write a Java program to extract a portion of a array list
        List<String> subList = listColors.subList(1, 4);
        System.out.println(subList);
        System.out.println();
    }
}
