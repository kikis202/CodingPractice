package com.day2;

import java.util.Scanner;

/*
6) Write a program which asks the user to input two whole numbers a and b.
Output "true", if one of this condition is true:
    1) a and b is equal
    2) a is less than 0 and b is greater than 0
    3) both of them are greater than 100
    otherwise output "false":
    Examples:
        a is -1 and b is -2 -> false
        a is -2 and b is 1 -> true
        a is -1 and b is -1 -> true
        a is 101 and b is 102 -> true
        a is 99 and b is 200 -> false
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /// Input
        System.out.println("Enter value a: ");
        int a = scanner.nextInt();

        System.out.println("Enter value b: ");
        int b = scanner.nextInt();

        // Output
        boolean valid = a == b || (a < 0 && b > 0) || (a > 100 && b > 100);
        System.out.println(valid);
    }
}
