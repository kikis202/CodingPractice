package com.practice;

/*
4) Ask user to input a whole number and output false, if it is even number and true if it is odd number
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /// Input
        System.out.println("Enter a whole number: ");
        int x = scanner.nextInt();

        /// Output
        System.out.println(x % 2 == 1);
    }
}
