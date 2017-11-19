/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaddemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arod6
 */
public class FileReadDemo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter File Name: ");
        String filename = keyboard.nextLine();
        System.out.println("***Files Starts Reading***");
        File file = new File(filename);

        try {
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()) {
                String documentText = inputFile.nextLine();

                System.out.println(documentText);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }

    }

}
