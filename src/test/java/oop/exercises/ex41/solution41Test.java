package oop.exercises.ex41;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution41Test extends TestCase {

    public void test_sorting_the_names_in_order_alphabetically() throws FileNotFoundException {

        File namesReadTest = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise41_input.txt");
        Scanner testScanner = new Scanner(namesReadTest);
        List<String> namesListTest = new ArrayList<>();

        while(testScanner.hasNextLine()) {
            namesListTest.add(testScanner.nextLine());
        }
        testScanner.close();

        namesListTest.sort(String::compareToIgnoreCase);

        List<String> namesListActual = new ArrayList<>();

        namesListActual.add("Johnson, Jim");
        namesListActual.add("Jones, Aaron");
        namesListActual.add("Jones, Chris");
        namesListActual.add("Ling, Mai");
        namesListActual.add("Swift, Geoffrey");
        namesListActual.add("Xiong, Fong");
        namesListActual.add("Zarnecki, Sabrina");

        assertEquals(namesListTest,namesListActual);
    }
}