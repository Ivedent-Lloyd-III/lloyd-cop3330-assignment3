package oop.exercises.ex43;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution 43 WebsiteGenerator Class
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteGenerator {

    public static void generateWebsiteOutput(String currentPath, String javaScriptFiles, String ccsFiles, String siteName, String authorName) throws IOException {
        File newWebsite = new File(currentPath);
        boolean createdWebsite = newWebsite.mkdir();

        if(createdWebsite){
            System.out.println("Created "+currentPath);
            try{
                FileWriter newfileWriter = new FileWriter(new File(currentPath+"\\index.html"));
                newfileWriter.write("<!DOCTYPE html PUBLIC>\n<html lang=\"en\">\n<head>\n");
                newfileWriter.write("\t<meta author=\""+authorName+"\">\n");
                newfileWriter.write("\t<title>"+siteName+"</title\n");
                newfileWriter.write("</head>\n<body>\n\n<body>\n</html>");
                newfileWriter.close();

                System.out.println("Created "+currentPath+"\\index.html");

                if(javaScriptFiles != null){
                    File js = new File(currentPath+"\\js");
                    boolean createdfolderJS = js.mkdir();

                    if(createdfolderJS){
                        System.out.println("Created "+js+"\\");
                    }
                    else{
                        System.out.println("No JS file was created.");
                    }
                }
                if(ccsFiles != null){
                    File ccs = new File(currentPath+"\\ccs");
                    boolean createdfolderCCS = ccs.mkdir();

                    if(createdfolderCCS){
                        System.out.println("Created "+ccs+"\\");
                    }
                    else{
                        System.out.println("No CSS file was created.");
                    }
                }
            }
            catch(IOException e){
                System.out.println("index.html not created as required");
            }
        }
        else{
            System.out.println("website folder not created");
        }
    }
}
