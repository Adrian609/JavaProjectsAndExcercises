/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc142;

import java.util.Scanner;

/**
 *
 * @author Arod6
 */
public class CSC142 {

    public static String main(String[] args) {

        int hour;
      String pack;
      double chargeA=0, chargeB=2,chargeC=19.95;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please select the package (A,B,or C)");
      pack = input.nextLine();
      
      System.out.println("Please enter the number of hours.");
      hour = input.nextInt();
      
      if(hour<=10)
      { 
         chargeA=9.95;
         chargeB=13.95;
      }
      else if(hour<=20)
      {
         chargeA=9.95+(hour-10)*2;
         chargeB=13.95;
      }
      else
      {
         chargeA=9.95+(hour-10)*2;
         chargeB=13.95+(hour-20)*1;
      }
      
      switch (pack)
      {
         case "A":
         {
            System.out.printf("Your charge is $%.2f, it save $%.2f from package B and $%.2f from package C",chargeA, chargeB-chargeA,chargeC-chargeA);
            break;
         }
         case "B":
         {
            System.out.printf("Your charge is $%.2f, it save $%.2f from package A and $%.2f from package C",chargeB, chargeA-chargeB,chargeC-chargeB);
            break;
         }
         case "C":
         {
            System.out.printf("Your charge is $%.2f, it save $%.2f from package A and $%.2f from package B",chargeC, chargeA-chargeC,chargeB-chargeC);
            break;
         }
         default:
         {
            System.out.println("Please select A, B, or C");
         }
      }
   }
}