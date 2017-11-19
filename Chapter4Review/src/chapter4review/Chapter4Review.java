/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4review;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Arod6
 */
public class Chapter4Review {

    /**
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int A=0,B=0,R=0,C1=0,C2=0;
      Random rand = new Random();
      
      for(int i=1;i<=10;i++)
      {
         A = rand.nextInt(6)+1;
         B = rand.nextInt(6)+1;
         R=comp(A,B);
         if (R==1) 
            C1++;
         else if (R==-1)
            C2++;            
      }
      
      if (C1>C2)
         System.out.println("User 1 wins.");
      else if (C1<C2)
         System.out.println("User 2 wins.");
      else 
         System.out.println("It's a tie.");
   }
   
   public static int comp (int A, int B)
   {
      if (A>B)
         return 1;
      else if (A<B)
         return -1;
      else
         return 0;
   }
}