package oop.exercises.ex46;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class solution46Test extends TestCase {

    public void test_for_correct_counting() throws FileNotFoundException {

        File readerTest = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise46_input.txt");
        Scanner inputTestSC = new Scanner(readerTest);

        int countBadger = 0;
        int countMushroom = 0;
        int countSnake = 0;

        while (inputTestSC.hasNextLine()) {
            String input = inputTestSC.nextLine();
            if (input.equals("snake")) {
                countSnake = countSnake + 1;
            }
        }
        inputTestSC.close();
        assertEquals(countSnake, 1);
    }
}