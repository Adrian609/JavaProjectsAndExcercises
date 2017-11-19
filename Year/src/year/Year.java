/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year;

import java.util.Scanner;

/**
 *
 * @author Arod6
 */
public class Year {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating the day object
        MonthDays day = new MonthDays();
        /* read in take in the information
        I tried to do the readin inside the main method send it to 
        the monthDays class and display it in the main method
        but I didnt understand how it worked */
        day.readIn();
        /* what is the difference when I call day.readIn()
        or when I call MonthDays.readIn()?
        display shows the information */
        day.display();
    }

}
