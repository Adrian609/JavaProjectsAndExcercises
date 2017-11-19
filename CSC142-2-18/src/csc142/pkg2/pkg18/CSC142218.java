/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc142.pkg2.pkg18;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Arod6
 */
public class CSC142218 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number=0;
        double total=0, averageScore=0;
        double [] average;
        average = new double [number];
        Scanner KB =new Scanner(System.in);
        System.out.println("Please enter number of students?");
        number = KB.nextInt();
        for (int i = 0; i < average.length; i++) {
             total += average[i]; 
             averageScore = total/average.length;
          
        }
        System.out.println(" "+total);
        System.out.println(" "+averageScore);
    }
    
}
