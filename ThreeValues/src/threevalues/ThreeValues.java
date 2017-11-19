/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threevalues;

import java.util.Scanner;

/**
 *
 * @author Arod6
 */
public class ThreeValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner (System.in);
        
        System.out.println("Enter Product Code: ");
        String productCode = sc.next();
        
        System.out.println("Enter Price");
        double price = sc.nextDouble();
        
        System.out.println("Enter Quantitiy");
        int quantity = sc.nextInt();
        
        
        double total = price * quantity;
        System.out.println();
        System.out.println(quantity + " " + productCode+ " @ "+ price + " = " + total) ;
        System.out.println();
        
        
        
        
        
        
        
        
        
    }
    
}
