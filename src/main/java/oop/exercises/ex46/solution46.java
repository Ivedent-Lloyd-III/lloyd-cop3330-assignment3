package oop.exercises.ex46;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 46
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution46 {

    public static void main(String[] args) throws IOException {

        // input a file and read
        // initialize a scanner and an map
        // count each word and keep track with a counter
        // output with solution

        fileReader();
    }

    private static void fileReader() throws IOException {
        String inputString;
        int count;

        // initialize the file reader and scanner
        File file = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise46_input.txt");
        Scanner sc = new Scanner(file);
        // initialize the HashMap
        HashMap<String, Integer> InputMap = new HashMap<>();

        // use the while statement to scan the file
        while (sc.hasNextLine()){
            inputString = sc.nextLine();
            // add the strings to an
            String[] wordArray = inputString.split("\\s+");

            // use nested loop to count word frequency
            for (String wordReader : wordArray) {
                // keep count of occurrences using "count"
                if (InputMap.containsKey(wordReader)) {
                    count = InputMap.get(wordReader);
                    InputMap.put(wordReader, count + 1);
                } else {
                    InputMap.put(wordReader, 1);
                }
            }
        }
        // use a loop to output from the HashMap
        for (Map.Entry<String, Integer> word : InputMap.entrySet()) {
            System.out.print(word.getKey() + " : ");
            // loop to print "*" character
            for(int i = 0; i < word.getValue(); i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}