package com.day2;

/*
3) Ask user to input a whole number and output true, if it is even number
                                           and false, if it is odd number

    Hint: use remainder operator to divide number by two and get reminder (if reminder is 0 then it means it is even number)-
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /// Input
        System.out.println("Enter a whole number: ");
        int x = scanner.nextInt();

        /// Output
        System.out.println(x % 2 == 0);
    }
}
