package org.practice.java.coding;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindStringinFile {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\vijug\\IdeaProjects\\Java Interview Prep\\src\\org\\practice\\java\\coding\\TestFile.txt");

        Scanner myReader = new Scanner(file);

        while (myReader.hasNext()){
            System.out.println(myReader.next());
        }

    }
}
