package oop.exercises.ex45;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution45Test extends TestCase {

    public void testMain() throws IOException {
        File readerTest = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise45_input.txt");
        Scanner inputTestSC = new Scanner(readerTest);

        File outputTest = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\testoutput45.txt");
        Scanner outputTestSC = new Scanner(outputTest);

        List<String> inputTest = new ArrayList<>();
        List<String> actualOutput = new ArrayList<>();

        String input;
        while (inputTestSC.hasNextLine()) {
            input = inputTestSC.nextLine();
            input = input.replaceAll("utilize", "use");
            inputTest.add(input);
        }
        while (outputTestSC.hasNextLine()) {
            actualOutput.add(outputTestSC.nextLine());
        }

        inputTestSC.close();
        outputTestSC.close();

        assertEquals(inputTest, actualOutput);
    }
}
