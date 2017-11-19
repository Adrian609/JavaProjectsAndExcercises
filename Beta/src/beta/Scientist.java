/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beta;

import java.util.Scanner;

/**
 *
 * @author Arod6
 */
class Scientist {
    
    String scientistName;
    String greatIdea;
    String listOfScientist;
    
     public String getScientistName()
      {
         return new String(scientistName);
      }
     public String getListOfScientist()
      {
        
         return listOfScientist;
      }
    public void readIn()
      {
         // Create Scanner object for keyboard input.
         Scanner keyboard = new Scanner(System.in);
             // Note: This is declared here since this is the only
                // method in the class that does keyboard input.

         // Logic ...
         System.out.print("\nScientist name: ");
         scientistName = keyboard.nextLine();
         scientistName = scientistName.toUpperCase();
         System.out.print("First Great Idea:   ");
         greatIdea = keyboard.nextLine();
         greatIdea = greatIdea.toUpperCase();
         System.out.print("Second Great Idea:  ");
         greatIdea = keyboard.nextLine();
         greatIdea = greatIdea.toUpperCase();
         System.out.print("Last great idea:     ");
         greatIdea = keyboard.nextLine();
         greatIdea = greatIdea.toUpperCase();
      }
    public void display()
      {
        // Display the scientist's name
         System.out.println("Student's name: " + scientistName);

        // Display the three great ideas
         System.out.println("First Great Idea:   " + greatIdea);
         System.out.println("Second Great Idea:  " + greatIdea);
         System.out.println("Final Great Idea:     " + greatIdea);

      }

    
    
}
