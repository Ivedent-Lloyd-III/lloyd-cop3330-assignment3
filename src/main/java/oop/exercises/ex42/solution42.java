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

        fileReader();

    }

    private static void fileReader() throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise42_input.txt");

        String text = null;
        System.out.println("----------");

        SortedMap<String,Integer> map = new TreeMap<String,Integer>();
        Scanner sc = new Scanner(inputFile).useDelimiter("[\",; ]+");
        while (sc.hasNextLine()) {
            if (sc.hasNext("[a-z]+")) {
                map.put(sc.next(), sc.nextInt());
            }
            sc.nextLine();
        }
        System.out.println(map);
    }

}
