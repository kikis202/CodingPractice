package com.day2;

/*
2) Ask user to input two boolean values and compare them.
    Input:
       Enter b1: true
       Enter b2: false
    Expected output:
       Is b1 and b2 equal? - false
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /// Input
        System.out.println("Enter b1: ");
        boolean b1 = scanner.nextBoolean();

        System.out.println("Enter b2: ");
        boolean b2 = scanner.nextBoolean();

        /// Output
        System.out.printf("%nIs b1 equal to b2? - %b%n",b1 == b2);
    }
}
