package com.assignments;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class AssignmentFileClass1 {

    public static void main(String[] args) {
        String path = "C:\\learning\\PG-FSD-Phase1\\weekend.txt";
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please write text to save to the file: ");
            String userInput = sc.nextLine();
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(userInput);
            fileWriter.close();
            FileReader fileReader = new FileReader(path);
            char[] arr = new char[userInput.length()];
            fileReader.read(arr);
            System.out.println(arr);
            fileReader.close();
        } catch(Exception e) {
            System.out.println("Error Occured: " + e.getMessage());
        }
    }
}
