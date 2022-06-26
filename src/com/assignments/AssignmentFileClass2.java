package com.assignments;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AssignmentFileClass2 {

    public static void main(String[] args) {
        try {
            for (var i = 0; i < 3; i++) {
                String path = "C:\\learning\\PG-FSD-Phase1\\day2.txt";
                DataInputStream dataInpStream = new DataInputStream(System.in);
                FileOutputStream fileOutStream = new FileOutputStream(path, true);
                BufferedOutputStream bufferOutStream = new BufferedOutputStream(fileOutStream, 1024);
                System.out.println("Enter text (@ at the end):");
                char ch;

                while ((ch = (char) dataInpStream.read()) != '@') {
                    bufferOutStream.write(ch);
                }
                bufferOutStream.close();

                if (i == 2) {
                    FileInputStream fileInpStream = new FileInputStream(path);
                    int inpCh;
                    while ((inpCh = fileInpStream.read()) != -1) {
                        System.out.print((char) inpCh);
                    }
                    fileInpStream.close();
                }

            }
        } catch (Exception e) {
            System.out.println("Error Occured: " + e.getMessage());
        }
    }
}
