package com.day4;

import java.io.File;
import java.io.FilenameFilter;

public class InOutStreams {
    public static void main(String[] args) {
        String downloadsPath = "/C:/Users/krist/Downloads/";
        String breakln = "======================";
        // Write a Java program to get a list of all file/directory names from the given
        File myFile = new File(downloadsPath);
        String[] files = myFile.list();
        for (String fileName : files) {
            System.out.println(fileName);
        }
        System.out.println(breakln);
        // Write a Java program to get specific files by extensions from a specified folder
        File myImgFile = new File(downloadsPath+"/Images");
        String[] pngImg = myImgFile.list(
                new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        if (name.endsWith(".png")) {
                            return true;
                        }
                        return false;
                    }
                }
        );
        for (String img : pngImg) {
            System.out.println(img);
        }
        System.out.println(breakln);
        // Write a Java program to check if a file or directory specified by pathname exists or not
        if (new File(downloadsPath).exists()) {
            System.out.printf("Path: '%s'%nExists!%n", downloadsPath);
        } else {
            System.out.printf("Path: '%s'%nDoesnt exist!%n", downloadsPath);
        }
        if (new File(downloadsPath+"/doesnt").exists()) {
            System.out.printf("Path: '%s'%nExists!%n", downloadsPath+"doesnt/");
        } else {
            System.out.printf("Path: '%s'%nDoesnt exist!%n", downloadsPath+"doesnt/");
        }
        System.out.println(breakln);
        // Write a Java program to check if given pathname is a directory or a file
        if (myImgFile.isFile()) {
            System.out.println("Is a file");
        } else {
            System.out.println("Is a dir");
        }
    }
}
