package com.practice;

/*
5) Write a program which reads boolean value from user and prints out the opposite value:
    Example input:
        Enter boolean value: true
    Expected output:
        Opposite of "true" is "false"
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /// Input
        System.out.println("Enter boolean value: ");
        boolean b1 = scanner.nextBoolean();

        System.out.printf("Opposite of \"%b\" is \"%b\"%n", b1, !b1);
    }
}
