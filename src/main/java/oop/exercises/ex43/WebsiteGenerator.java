package oop.exercises.ex43;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 43 WebsiteGenerator Class
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteGenerator {

    public static void generateWebsiteOutput(String javaScriptFiles, String ccsFiles, String siteName, String authorName) throws IOException {


        File f = new File("C:\\Users\\ivede\\Desktop\\OOP Exercises\\index.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("<html><title><h1>"+siteName+"</h1>");
        bw.write("<html><meta><h2>"+authorName+"</h2>");

        bw.close();


    }

}
