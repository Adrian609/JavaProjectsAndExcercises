/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoidemo;

/**
 *
 * @author Arod6
 */
public class HanoiDemo {
private int numDiscs;
    /**
     * @param args the command line arguments
     */
public HanoiDemo(int n){
    numDiscs = n;
    moveDiscs (numDiscs, 1, 3, 2);
}
    public static void main(String[] args) {
        
    }

    private void moveDiscs(int num, int from, int to, int temp) {
        if (num>0) {
            moveDiscs(num-1,from,temp,to);
            System.out.println("This"+from+"this"+to);
            moveDiscs(num-1, from, to, temp);
        }
    }
    
}
