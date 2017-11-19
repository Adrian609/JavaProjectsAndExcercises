/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Arod6
 */
public class JavaApplication1 {

    public static void main(String[] args) throws FileNotFoundException {
        Random rand = new Random();
        int compWins = 0, userWins = 0;
        PrintWriter outputFile = new PrintWriter("dies.txt");

        for (int i = 0; i < 10; i++) {
            int compDie = rand.nextInt(6) + 1;
            int userDie = rand.nextInt(6) + 1;

            if (compWins > userWins) {
                outputFile.print("User wins!!! " + compDie + " " + userDie);
            } else if (compWins < userWins) {
                outputFile.println("User wins" + compDie + " " + userDie);
            } else {
                outputFile.println("It is a tie" + compDie + " " + userDie);
            }
        }
        outputFile.close();

    }

}
