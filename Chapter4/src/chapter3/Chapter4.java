/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arod6
 */
public class Chapter4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
      Random rand = new Random();
      int ComW=0,UserW=0;
      PrintWriter outputFile =  new PrintWriter("dies.txt");
      
      for (int i=1;i<=10;i++)
      {
         int ComDie = rand.nextInt(6)+1;
         int UserDie = rand.nextInt(6)+1;   
         if(ComDie>UserDie)
            ComW++;
         else if(ComDie<UserDie)
            UserW++;
      
      if (ComW>UserW)
         outputFile.println("Computer Wins!");
      else if(ComW<UserW)
         outputFile.println("User Wins!");
      else
         outputFile.println("It is a tie.");
      }
      outputFile.close();
   
   }


}
