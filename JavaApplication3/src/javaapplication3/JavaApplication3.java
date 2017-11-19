/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

 import java.util.*;
/**
 *
 * @author Arod6
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner stdIn = new Scanner(System.in);
        String longNumber;
        LinkedList backwardList = new LinkedList();
        LinkedList forwardList = new LinkedList();
        LinkedList temp = null, temp1 = null;
        
        int number; //input from user
        int sum=0;
        
        System.out.println("Input 4 integers!");
        for (int i=0;i<4;i++){
            number=stdIn.nextInt();
            backwardList.addFirst(number);
            forwardList.add(number);
            sum+=number;
        }
        //use overloaded SOP
        System.out.println(backwardList);
        System.out.println(forwardList);
        System.out.println("Sum = "+sum);
        //use get for each node
        System.out.println("Use get to traverse linked list - really using next links!");
        for (int j=0;j<4;j++)
            System.out.print(backwardList.get(j)+" ");//uses next links to traverse!
        System.out.println();
        //now use temp to refer to two different lists
        System.out.println("Use temp now!");  
        temp=backwardList;
        System.out.println(temp);
        temp=forwardList;
        System.out.println(temp); 
        //use temp to reduce the O(N^2) algorithm to traverse the list to O(N) without enhanced for loop w/iterator
        temp.clear();
        for (int j=0;j<4;j++){
            number=(int)backwardList.remove();
            System.out.println(number);
            temp.addFirst(number);
        }
        System.out.println(temp);
        backwardList=temp;
        
    }//end main
}//end class

