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
        HashMap<String, Integer> map = new HashMap<>();

        while (sc.hasNextLine()){
            inputString = sc.nextLine();
            String[] wordsArray = inputString.split("\\s+");

            for (String word : wordsArray) {
                if (map.containsKey(word)) {
                    count = map.get(word);
                    map.put(word, count + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " : ");
            for(int i = 0; i < entry.getValue(); i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

