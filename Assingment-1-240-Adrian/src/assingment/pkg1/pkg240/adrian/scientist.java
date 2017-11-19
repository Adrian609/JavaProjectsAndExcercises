/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment.pkg1.pkg240.adrian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Arod6
 */
public class scientist {

    /**
     *
     * @param listOfScientist the value of listOfScientist
     */
    
    String scientistName;
    String scientistField;
    String greatIdeas;
    final private int MAXCLASS;

    public scientist() {
        MAXCLASS = 5;
        scientistName = "";
        scientistField = "";
        greatIdeas = "";
    }

    public scientist(String sName, String sField, String gIdeas) {
        this.MAXCLASS = 5;
        scientistName = new String(sName);
        scientistField = new String(sField);
        greatIdeas = new String(gIdeas);
    }

    //acessors and mutators
    public void setScientistName(String sName) {
        scientistName = new String(sName.toUpperCase());
    }

    public void setFields(String sField) {
        scientistField = new String(sField.toUpperCase());
    }

    public void setGreatIdeas(String gIdeas) {
        greatIdeas = new String(gIdeas.toUpperCase());
    }

    public String getScientistName() {
        return new String(scientistName);
    }

    public String getGreatIdeas() {
        return new String(greatIdeas);
    }

    public String getScientistField() {
        return new String(scientistField);
    }

//    public boolean hasGreatIdea(String anIdea) {
//        returns 
//
//    false;
//    }

    public void becomesCopyOf(scientist source) {
        // Set the fields for the calling object to the corresponding
        // fields of source.
        scientistName = new String(source.getScientistName());
        scientistField = new String(source.getScientistField());
        greatIdeas = new String(source.getGreatIdeas());
    }

    public void readIn() {

        // Create Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        int numberOfScientist;
        System.out.print("How many scientist are in this section? ");
        numberOfScientist = Integer.parseInt(keyboard.nextLine());
        while (numberOfScientist < 0) {
            System.out.println("You must enter a positive number.");
            System.out.print("How many students are in this section? ");
            numberOfScientist = Integer.parseInt(keyboard.nextLine());
        }
        if (numberOfScientist > MAXCLASS) {
            System.out.println("Only " + MAXCLASS
                    + "many students are permitted."
                    + "You will be prompted for " + MAXCLASS
                    + "-many students only.");
            numberOfScientist = MAXCLASS;
        }
        for (int i = 0; i < numberOfScientist; i++) {
            System.out.print("\nScientist's name: ");
            scientistName = keyboard.nextLine();
            scientistName = scientistName.toUpperCase();
            System.out.print("\nScientist's field: ");
            scientistField = keyboard.nextLine();
            scientistField = scientistField.toUpperCase();
            System.out.print("\nScientist's great idea: ");

            greatIdeas = keyboard.nextLine();
            greatIdeas = greatIdeas.toUpperCase();
            display();
        }
        System.out.println("Thank you. Scientist data entry is completed.");
    }

    public void display() {
        System.out.println("Scientist Names: " + scientistName);
        System.out.println("Field: " + scientistField);
        
        System.out.println("Great Idea: " + greatIdeas/*.split(";\n")*/);

    }
    static void getName(ArrayList<scientist> listOfScientist) {
        int count = listOfScientist.size();
        System.out.println("Number of Scientist: " + count);
        for (int i = 0; i < listOfScientist.size(); i++) {
            System.out.println("Scientist in ABC order: " + listOfScientist);
        }
    }

}
