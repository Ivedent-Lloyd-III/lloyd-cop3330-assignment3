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
        readFile();
    }
    private static void readFile() throws IOException {
        File file = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise45_input.txt");
        Scanner sc = new Scanner(file);
        FileWriter writer = new FileWriter("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise45_output.txt");

        try {
            while (sc.hasNextLine()) {
                String user = sc.nextLine();
                user = user.replaceAll("utilize", "use");
                writer.write(user);
                writer.write("\n");
            }
        } finally {
            sc.close();
        }
        System.out.println("\n Successfully modified!!");
        writer.close();
    }
}
