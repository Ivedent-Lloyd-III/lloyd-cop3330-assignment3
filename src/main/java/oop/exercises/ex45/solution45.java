package oop.exercises.ex45;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 45
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class solution45 {

    public static void main(String[] args) throws IOException {

        // read in the file
        // scan the file looking for "utilize"
        // when it finds a "utilize" replaces with "use"
        // print output to a file

        // use a function to read the file
        readFile();
    }
    private static void readFile() throws IOException {

        // initialize the file and scanner
        File inputFile = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise45_input.txt");
        Scanner sc = new Scanner(inputFile);
        // initialize the file writer
        FileWriter writer = new FileWriter("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise45_output.txt");

        try {
            // use this loop to run through until there are no more lines
            while (sc.hasNextLine()) {
                String user = sc.nextLine();
                // change the string "utilize" to "use"
                user = user.replaceAll("utilize", "use");
                writer.write(user);
                writer.write("\n");
            }
            // close the scanner and writer
        } finally {
            sc.close();
        }
        writer.close();
    }
}
