/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Arod6
 */
public class Lottery {

    public static final int NUMBERS = 6;
    public static final int MAX_NUMBER = 40;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // get winning numbers and ticket sets
        Set<Integer> pickSix = createWinningNumbers();
        Set<Integer> userTicket = getTicket();
        System.out.println();

        // keep only the winning numbers from the user's ticket
        Set<Integer> intersection = new TreeSet<>(userTicket);
        intersection.retainAll(pickSix);

        // display results
        System.out.println("Your ticket numbers are " + userTicket);
        System.out.println("The winning numbers are "
                + pickSix);
        System.out.println();
        System.out.println("You had " + intersection.size()
                + " matching numbers.");

    }

    // generates a set of the winning lotto numbers
    public static Set<Integer> createWinningNumbers() {
        Set<Integer> pickSix = new TreeSet<>();
        Random r = new Random();
        while (pickSix.size() < NUMBERS) {
            int number = r.nextInt(MAX_NUMBER) + 1;
            pickSix.add(number);
        }
        return pickSix;
    }

    // reads the player's lottery user ticket from the key board
    public static Set<Integer> getTicket() {
        Set<Integer> userTicket = new TreeSet<>();
        Scanner kb = new Scanner(System.in);
        System.out.print("Type your " + NUMBERS
                + " unique lotto numbers: ");
        while (userTicket.size() < NUMBERS) {
            int number = kb.nextInt();
            userTicket.add(number);
        }
        return userTicket;
    }

}
