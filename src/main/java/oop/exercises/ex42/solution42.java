package oop.exercises.ex42;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 42
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class solution42 {

    public static void main(String[] args) throws FileNotFoundException {

        // read the file
        // scan the file and separate the strings at the ","
        // format the output
        // print the strings in proper spots

        fileReader();
    }

    private static void fileReader() throws FileNotFoundException {
        // read the file
        File inputFile = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise42_input.txt");
        Scanner scan = new Scanner(inputFile);

        // scan in the string
        while(scan.hasNextLine()) {
            String input = scan.nextLine();
            String [] output = input.split(",");

        }
    }
}
