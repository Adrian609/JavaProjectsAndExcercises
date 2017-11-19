/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classex2;

/**
 *
 * @author Arod6
 */
public class ClassEX2 {

    public static void main(String[] args) {

        Grades g = new Grades();
        double total = g.getTotal();
        double average = g.getAverage();
        int []scores = g.scores;
        System.out.println(total);
        System.out.println(average);
        System.out.println(scores);
        
    }

    

}
