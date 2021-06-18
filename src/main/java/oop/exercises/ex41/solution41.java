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

       List<String> namesList = listNames();
       sortNames(namesList);
    }

    private static List<String> listNames() throws FileNotFoundException {
        File names = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise41_input.txt");
        Scanner sc = new Scanner(names);

        List<String> namesList = new ArrayList<>();

        while(sc.hasNextLine()) {
            namesList.add(sc.nextLine());
            count = count + 1;
        }
        sc.close();
        return namesList;
    }

    private static void sortNames(List<String> namesList) throws FileNotFoundException {
        namesList.sort(String::compareToIgnoreCase);
        PrintWriter fileWriter = new PrintWriter("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise41_output.txt");

        fileWriter.println("Total of "+count+" names");
        fileWriter.println("_________________________");

        for(Object o : namesList)
            fileWriter.println(o);

        fileWriter.close();
    }
}
