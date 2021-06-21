package oop.exercises.ex43;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 43
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.io.IOException;
import java.util.Scanner;

public class solution43 {
    static Scanner in = new Scanner(System.in);

    private static String siteName;
    private static String authorName;
    private static String javaScriptFiles;
    private static String ccsFiles;
    private static String currentPath;

    public static void main(String[] args) throws IOException {

        // use a function twice to prompt for two strings
        // the first call returns a string value for "site name"
        // the second call returns a string value for "author"
        // use another function to assign class variables
        // create a class to output the website

        // series of function calls for user String inputs
        nameStringInputs();
        filesGenerator();

        // get directory
        currentPath = System.getProperty("user.dir");
        currentPath += "\\"+siteName;

        // call for generator class to generate the html
        WebsiteGenerator wg = new WebsiteGenerator();
        wg.generateWebsiteOutput(currentPath, siteName, authorName, javaScriptFiles, ccsFiles);

        // use a function to initialize class variables
        // use a new class to output;
    }

    private static void nameStringInputs() {
        // class variable initialization
        System.out.print("Site Name: ");
        siteName = in.nextLine();
        System.out.print("Author: ");
        authorName = in.nextLine();
    }

    private static void filesGenerator() {

        // initialize class variables for the folders
        System.out.print("Do you want to make a folder for JavaScript? ");
        String javascriptInput = in.nextLine();

        if(javascriptInput.equals("Y") || javascriptInput.equals("y")){
            javaScriptFiles = "jv";
        }
        else{
            javaScriptFiles = null;
        }
        System.out.print("Do you want to make a folder for CSS? ");
        String cssInput = in.nextLine();

        if(cssInput.equals("Y") || cssInput.equals("y")){
            ccsFiles = "ccs";
        }
        else{
            ccsFiles = null;
        }
    }
}
