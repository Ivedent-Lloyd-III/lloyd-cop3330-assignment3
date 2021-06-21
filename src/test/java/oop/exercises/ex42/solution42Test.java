package oop.exercises.ex42;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class solution42Test extends TestCase {

    public void test_parse_file() throws FileNotFoundException {


        File inputFile = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise42_input.txt");
        Scanner scan = new Scanner(inputFile);

        // scan in the string
        String input = scan.nextLine();
        String[] output = input.split(",");

        for (String s : output) {

        }
    }
}