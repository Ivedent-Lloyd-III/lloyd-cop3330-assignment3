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
        fileReader();
    }

    private static void fileReader() throws IOException {
        String inputString;
        int count;

        File file = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise46_input.txt");
        Scanner sc = new Scanner(file);
        HashMap<String, Integer> InputMap = new HashMap<>();

        while (sc.hasNextLine()){
            inputString = sc.nextLine();
            String[] wordArray = inputString.split("\\s+");

            for (String wordReader : wordArray) {
                if (InputMap.containsKey(wordReader)) {
                    count = InputMap.get(wordReader);
                    InputMap.put(wordReader, count + 1);
                } else {
                    InputMap.put(wordReader, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> word : InputMap.entrySet()) {
            System.out.print(word.getKey() + " : ");
            for(int i = 0; i < word.getValue(); i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

