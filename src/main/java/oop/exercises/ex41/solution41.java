package oop.exercises.ex41;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 41
 *  Copyright 2021 first_name last_name
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class solution41 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        // read the file
        // create a Arraylist for the names
        // sort the names
        // print the names

        readFileInput();

    }

    private static void readFileInput() throws FileNotFoundException {
        Scanner fileReader = new Scanner(new File("exercise41_input.txt"));

    }

}
