/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

import java.util.Scanner;

/**
 *
 * @author Arod6
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
   
        Scanner kb = new Scanner(System.in);
        System.out.println("Num?");
        i = kb.nextInt();
        NewClass Obj = new NewClass(i);
        System.out.println(Obj.toString());
        
        
        
    }
    
}
