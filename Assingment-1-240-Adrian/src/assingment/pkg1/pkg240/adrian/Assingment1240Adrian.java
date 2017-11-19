/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment.pkg1.pkg240.adrian;

import javax.swing.JOptionPane;
import java.*;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Arod6
 */
public class Assingment1240Adrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<scientist> listOfScientist;
        
        listOfScientist = getScientistData();
        sortDataByName(listOfScientist);
        userMenu();
        menuChoice(listOfScientist);

    }

    private static ArrayList<scientist> getScientistData() {
        scientist currScientist;
        char userResponseCH;

        ArrayList<scientist> listofSci = new ArrayList<scientist>();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nPlease enter Scientist data when promted.");
        System.out.println("add Scientist name");
        do {
            currScientist = new scientist();
            currScientist.readIn();
            listofSci.add(currScientist);

            System.out.println("Would you like to add another Scientist?(Y/N)");
            userResponseCH = keyboard.nextLine().toUpperCase().charAt(0);
        } while (userResponseCH == 'Y');

        return listofSci;
    }

    private static void sortDataByName(ArrayList<scientist> listOfScientist) {
        boolean weAreDone = false;
        scientist swapScientist;
        String firstName;
        String secondName;
        int pass;
        int passLimit = listOfScientist.size() - 1;

        swapScientist = new scientist();

        for (pass = 1; (weAreDone == false) && (pass <= passLimit);
                pass++) {
            weAreDone = true;	// If no swaps occur during this pass,
            // the ArrayList is sorted

            // The inner loop performs a pass
            for (int i = 0; i < (listOfScientist.size() - pass); i++) {
                // Get the names for the two students being compared
                firstName = listOfScientist.get(i).getScientistName();
                secondName = listOfScientist.get(i + 1).getScientistName();

                // Swap two Students if they are out of order
                if (firstName.compareTo(secondName) > 0) {
                    // They are out of order. Swap 'em
                    swapScientist = listOfScientist.get(i);
                    listOfScientist.set(i, listOfScientist.get(i + 1));
                    listOfScientist.set(i + 1, swapScientist);
                    weAreDone = false;  // We ain't necessarily done yet
                }
            }  // end inner loop
        }

    }

    private static ArrayList<scientist> bubbleSort(ArrayList<scientist> listOfScientist) {
        int num = listOfScientist.size();

        do {
            int newNum = 0;
            for (int i = 1; i <= num - 1; i++) {
                String stringA = listOfScientist.get(i - 1).getScientistName();
                String stringB = listOfScientist.get(i).getScientistName();

                if (stringA.compareTo(stringB) > 0) {
                    scientist temp = listOfScientist.get(i);
                    listOfScientist.set(i, listOfScientist.get(i - 1));
                    listOfScientist.set(i - 1, temp);
                    newNum = i;
                }
            }
            num = newNum;
        } while (num != 0);

        return listOfScientist;
    }

    private static void performSearches(ArrayList<scientist> listOfScientist) {
        // Local data ...
        char userResponseCh;			// Char extracted from Grump's response
        // to the do you want to perform another
        // search query.  Valid responses are
        // 'Y' or 'N' (Yes or No).
        String searchKey;				// The name of the student Grump wants
        // to search for.
        int whereFound;				// Index where searchKey was found in
        // the ArrayList. -1 means search failed.

        // Logic ...
        // Create Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        // Inform Grump the search phase is ready to begin.
        System.out.println("\n\nThe program is now entering the search phase.");

        // Do at least one search, then ask Grump if he wants to do another
        do {
            // Ask Grump to enter the name of a student
            System.out.print("\nPlease enter name of scientist: ");
            searchKey = keyboard.nextLine();
            searchKey = searchKey.toUpperCase();

            // Pass search key to binary search algorithm
            whereFound = binarySearch(listOfScientist, searchKey);

            // Give results to Grump
            if (whereFound == -1) {
                System.out.println("This scientist data was not found.");
            } else {
                System.out.println("This \"Scientist Field\" was: "
                        + (listOfScientist.get(whereFound).getScientistField()));
                System.out.println("This Scientist \"Great Idea\" was: "
                        + (listOfScientist.get(whereFound).getGreatIdeas()));

            }

            // Ask Grump if he wants to enter another name.
            System.out.print("\nDo you want to enter another name? (Y/N) ");
            userResponseCh = keyboard.nextLine().toUpperCase().charAt(0);
        } while (userResponseCh == 'Y');
    }

    public static int binarySearch(ArrayList<scientist> listOfScientist,
            String searchKey) {
        // Local variables
        int first;				// Index of first element in listOfStudents
        // still in contention
        int last;				// Index of last element in listOfStudents
        // still in contention
        int middle;				// Index of the middle element of the
        // part of listOfStudents still in contention
        int whereFound;		// Index where searchKey was found
        // (if it was)
        boolean found;			// True if we found it; false otherwise
        String midStuName;	// Name of Student at the middle element

        // Logic ...
        // Inititalize variables to set up for search process
        first = 0;
        last = listOfScientist.size() - 1;
        found = false;
        whereFound = -1;

        // Do the searching
        while (!found && first <= last) {
            // Calculate the index of the middle element
            // and get the name of the Student located there
            middle = (first + last) / 2;
            midStuName = listOfScientist.get(middle).getScientistName();

            // Either we found it, or we need to update
            // either first or last
            if (midStuName.equals(searchKey)) {
                // We found it
                found = true;
                whereFound = middle;
            } else if (midStuName.compareTo(searchKey) > 0) {
                // Let's search the top half of the ArrayList
                last = middle - 1;
            } else {
                // Let's search the bottom half of the ArrayList
                first = middle + 1;
            }
        }  // end while

        // Return where searchKey was found or -1
        return whereFound;
    }

    private static void menuChoice(ArrayList<scientist> listOfScientist) {
        int menuChoice;

        System.out.println("Please enter a number 1-5");
        Scanner keyboard = new Scanner(System.in);
        menuChoice = keyboard.nextInt();
        System.out.println("BEAUTIFUL MINDS TRACKING SYSTEM DATA MENU\n"
                + "1 – Display the names of all of the scientists\n"
                + "2 – Display all data for a specific scientist\n"
                + "3 – Display the names of the scientists that belong to a particular field\n"
                + "4 – Display the names of scientists associated with a specific great idea\n"
                + "5 - Quit");
        switch (menuChoice) {
            case 1:
                scientist.getName(listOfScientist);
                break;
            case 2:
                performSearches(listOfScientist);
                break;
            case 3:

                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
        }


    }

    private static void userMenu() {
        System.out.println("BEAUTIFUL MINDS TRACKING SYSTEM DATA MENU\n"
                + "1 – Display the names of all of the scientists\n"
                + "2 – Display all data for a specific scientist\n"
                + "3 – Display the names of the scientists that belong to a particular field\n"
                + "4 – Display the names of scientists associated with a specific great idea\n"
                + "5 - Quit");

    }

}
