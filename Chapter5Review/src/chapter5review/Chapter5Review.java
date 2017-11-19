/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5review;

import java.util.Scanner;

/**
 *
 * @author Arod6
 */
public class Chapter5Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double width=0, length=0, area =0;
        length = getLength();
        width = getWidth();
        area=getArea(width, length);
        displayData(width,length,area);
    }

    private static double getLength() {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the length of the rectangle.");
        double length=input.nextDouble();
        return length;
    }

    private static double getWidth() {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the width of the rectangle.");
        double width=input.nextDouble();
        return width;
    }

    private static double getArea(double width, double length) {
        Scanner input = new Scanner(System.in);
        System.out.println("The area is: ");
        double area = width*length;
        return area;
    }

    private static void displayData(double width, double length, double area) {
        System.out.println("The width of the rectangle is "+width);
        System.out.println("The legth ot the rectangle is "+length);
        System.out.println("The area to the rectangle is "+area);
    }
    
}
