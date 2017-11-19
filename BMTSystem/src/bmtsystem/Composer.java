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
public class Composer extends Element {

    String name;
    String nationality;
    String greatCompostions;
    Scanner keyboard = new Scanner(System.in);

    public Composer() {
        name = "";
        nationality = "";
        greatCompostions = "";
    }

    public Composer(String aName, String aNat, String aComp) {
        name = aName;
        nationality = aNat;
        greatCompostions = aComp;
    }

    public void readIn() {
        System.out.println("Composers Name: ");
        name = keyboard.nextLine().toUpperCase();

        System.out.println("Composers Nationality: ");
        nationality = keyboard.nextLine();

        System.out.println("Composers Great Compositions: ");
        greatCompostions = keyboard.nextLine();

    }

    public void setName(String aName) {
        name = aName.toUpperCase();
    }

    public void setNationality(String aNat) {
        nationality = aNat.toUpperCase();
    }

    public void setCompostition(String aComp) {
        greatCompostions = aComp.toUpperCase();
    }

    public String getName() {
        return name;
    }

    // This method is the accessor for Location
    public String getNationality() {
        return nationality;
    }

    // This method is the accessor for Phone
    public String getCompostition() {
        return greatCompostions;

    }
    public void Display()
    {
        System.out.println("Name of Composer: " + this.name);
        System.out.println("Nationality: " + this.nationality);
        System.out.println("Great Compostions: " + this.greatCompostions);

    }
    //Compares Composers
    public boolean equals(Element otherComposer)
    {
        return name.equals(((Composer) otherComposer).name);
    }
    
    //Returns reference to deep copy of the calling object
    public Element clone()
    {
        Composer theClone = new Composer();
        theClone.name = new String(name);
        theClone.nationality = new String(nationality);
        theClone.greatCompostions = new String(greatCompostions);
        return theClone;  
    }

}
