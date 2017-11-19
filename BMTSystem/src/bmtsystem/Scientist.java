/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmtsystem;

import java.util.Scanner;

/**
 *
 * @author ar839271
 */
public class Scientist extends Element{
    //fields for storing and getting data

    private static final Scanner KB = new Scanner(System.in);
    String name;
    String field;
    String ideas;
    //MAX class to stop the number of user imports
    
// scientist contructor initialized
    public Scientist() {
        name = "";
        field = "";
        ideas = "";
    }
//passing to scientist contructor

    public Scientist(String sName, String sField, String gIdeas) {
        
        name = new String(sName);
        field = new String(sField);
        ideas = new String(gIdeas);
    }
// setters and getters for setting scientist names, fields and great ideas

    public void setScientistName(String sName) {
        name = new String(sName.toUpperCase());
    }

    public void setFields(String sField) {
        field = new String(sField.toUpperCase());
    }

    public void setGreatIdeas(String gIdeas) {
       ideas = new String(gIdeas.toUpperCase());
    }
// get scientist name ideas and fields

    public String getName() {
        return new String(name);
    }

    public String getGreatIdeas() {
        return new String(ideas);
    }

    public String getScientistField() {
        return new String(field);
    }
// creating a copy to use instead of using the original

    public void becomesCopyOf(Scientist source) {
        // Set the fields for the calling object to the corresponding
        // fields of source.
        name = new String(source.getName());
        field = new String(source.getScientistField());
        ideas = new String(source.getGreatIdeas());
    }


   
// get scientist data from the user and store it in an array

  
    public void Display()
    {
        System.out.println("Scientist name: " + this.name);
        System.out.println("Scientist Field: " + this.field);
        System.out.println("Great Ideas: " + this.ideas);

    }
    //Compares 
    
    public boolean equals(Element otherScientist)
    {
        return name.equals(((Scientist) otherScientist).name);
    }
    
    //Returns reference to deep copy of the calling object
    public Element clone()
    {
        Composer theClone = new Composer();
        theClone.name = new String(name);
        theClone.nationality = new String(field);
        theClone.greatCompostions = new String(ideas);
        return theClone;  
    }

    public void readIn() {
        System.out.println("Scientist Name: ");
        name = KB.nextLine().toUpperCase();

        System.out.println("Scientist Field: ");
        field = KB.nextLine();

        System.out.println("Great Ideas: ");
        ideas = KB.nextLine();

    }
}
