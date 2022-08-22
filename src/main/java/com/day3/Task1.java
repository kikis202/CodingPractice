package com.day3;

/*
1) Write a program which creates two dimensional
   array and stores a multiplication table (from 1 - 10) in it.
    Example of output:
        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        ....
        10 * 9 = 90
        10 * 10 = 100
    Hint:
       1) don't forget that you have to save the values in the array and output them from the array.
       2) Arrays should be the size of [10][10]
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        // declare 2d array
        int[][] mTable = new int[10][10];
        // fill the array with multiplication table
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mTable[i][j] = (i+1)*(j+1);
            }
        }
        // turn the 2d array in string output
        System.out.println(Arrays.deepToString(mTable).replace("], ", "]\n"));
    }
}
