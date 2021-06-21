package oop.exercises.ex46;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution46Test extends TestCase {

    public void test_for_correct_counting() throws FileNotFoundException {
        String inputString;
        int count;
        File file = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\exercise46_input.txt");
        Scanner sc = new Scanner(file);
        HashMap<String, Integer> map = new HashMap<>();

        while (sc.hasNextLine()) {
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
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}