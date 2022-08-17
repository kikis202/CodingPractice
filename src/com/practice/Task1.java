package com.practice;
/*
1) Ask user to input two numbers, compare them and output result:
   Input:
       Enter value a: 10
       Enter value b: 10
   Expected output:
       is 10 equal to 10? - true
       is 10 less than 10? - false
       is 10 less or equal to 10? - true
       is 10 greater than 10? - false
       is 10 greater or equal to 10? - true
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /// Input
        System.out.println("Enter value a: ");
        int a = scanner.nextInt();

        System.out.println("Enter value b: ");
        int b = scanner.nextInt();

        /// Output
        System.out.printf("%nis %d equal to %d? - %b%n", a, b, a == b);
        System.out.printf("is %d less than %d? - %b%n", a, b, a < b);
        System.out.printf("is %d less or equal to %d? - %b%n", a, b, a <= b);
        System.out.printf("is %d greater than %d? - %b%n", a, b, a > b);
        System.out.printf("is %d greater or equal to %d? - %b%n", a, b, a >= b);

    }
}
