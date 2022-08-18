package com.day3;

/*
2) Declare and initialize an array with four arbitrary whole numbers.
// Write a Java program to copy this array by iterating it.
 */
public class Task2 {
    public static void main(String[] args) {
        // declaration and initialization of fourNumbers
        int[] fourNumbers = new int[4];
        for (int i = 0; i < fourNumbers.length; i++) {
            fourNumbers[i] = ((int) ((Math.random() * 100 + 1)));
        }

        // declaration of destination array
        int[] copyFourNumbers = new int[fourNumbers.length];
        // iterating through fourNumbers and assigning same values to copyFourNumbers
        for (int i = 0; i < fourNumbers.length; i++) {
            copyFourNumbers[i] = fourNumbers[i];
        }

        // printing both arrays, to make sure they match
        for (int number : fourNumbers) {
            System.out.printf("%d ", number);
        }
        System.out.println();
        for (int number : copyFourNumbers) {
            System.out.printf("%d ", number);
        }
    }
}
