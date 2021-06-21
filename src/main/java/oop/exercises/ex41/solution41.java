package oop.exercises.ex41;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 41
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.io.*;
import java.util.*;

public class solution41 {

    private static int count = 0;

    public static void main(String[] args) throws FileNotFoundException {
        // read the file
        // create a Arraylist for the names
        // count the names with a counter
        // sort the names
        // print the names

        // function call and Array Initialization
       List<String> namesList = listNames();
       // call function for output
       sortNames(namesList);
    }

    private static List<String> listNames() throws FileNotFoundException {
        // read a file from a directory and initialize a scanner
        File names = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise41_input.txt");
        Scanner sc = new Scanner(names);

        // initialize a new Arraylist
        List<String> namesList = new ArrayList<>();

        // loop and count through the file
        while(sc.hasNextLine()) {
            namesList.add(sc.nextLine());
            count = count + 1;
        }
        sc.close();
        //return the array
        return namesList;
    }

    private static void sortNames(List<String> namesList) throws FileNotFoundException {
        // Sort the names in order and initialize the writer
        namesList.sort(String::compareToIgnoreCase);
        PrintWriter fileWriter = new PrintWriter("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise41_output.txt");

        // format the output
        fileWriter.println("Total of "+count+" names");
        fileWriter.println("_________________________");

        // loop the output and print the array
        for(Object o : namesList)
            fileWriter.println(o);

        // close the file writer
        fileWriter.close();
    }
}
