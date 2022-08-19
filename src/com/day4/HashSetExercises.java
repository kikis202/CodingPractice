package com.day4;

import java.util.*;

public class HashSetExercises {
    public static void main(String[] args) {
        // Write a Java program to append the specified element to the end of a hash set
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Yellow");
        hashSet.add("Cyan");
        hashSet.add("Magenta");
        hashSet.add("White");
        hashSet.add("Black");
        System.out.println(hashSet);
        System.out.println();
        // Write a Java program to convert a hash set to an array
        String[] newArray = new String[hashSet.size()];
        hashSet.toArray(newArray);
        for (String s: newArray) {
            System.out.printf("%s ", s);
        }
        System.out.printf("%n%n");
        // Write a Java program to convert a hash set to a tree set
        Set<String> tree = new TreeSet<>(hashSet);
        for (String s : tree) {
            System.out.printf("%s ", s);
        }
        System.out.printf("%n%n");
        // Write a Java program to convert a hash set to a List/ArrayList
        List<String> list = new ArrayList<>(hashSet);
        System.out.println(list);
    }
}
