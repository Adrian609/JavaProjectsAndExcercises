/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beta;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arod6
 */
public class Beta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ArrayList<Scientist> listOfScientist;
                 
         System.out.println("Welcome, Professor Grump. " +
                        "\nHope you are having a good day.");

        // Get the Student data from Grump
         listOfScientist = getScientistData();

         
         sortDataByName(listOfScientist);

     
         performSearches(listOfScientist);
        
        
    }
    public static ArrayList<Scientist> getScientistData()
      {
       	// Local variables ...
         Scientist currScientist;	   // Current student being read in
         char userResponseCh;		// Char extracted from Grump's response to
                                 // the is there another student query.
      									// Valid values are 'Y' or 'N' (Yes or No).

      	// Logic ...
      	// Create the ArrayList we are reading into.
         ArrayList<Scientist> listOfScientist = new ArrayList<Scientist>();

      	// Create Scanner object for keyboard input.
         Scanner keyboard = new Scanner(System.in);

       	// Give Grump instructions
         System.out.println("\nPlease enter student data when prompted.");
         System.out.println("For this program, enter the last name first " +
                            "\nwhen you enter a student's name.");

         // Get the student data from Grump
         do
         {
         	// Create new Student object, get the Student data from Grump
         	//  and add it to the ArrayList
            currScientist = new Scientist();
            currScientist.readIn();
            listOfScientist.add(currScientist);

           	// Ask Grump if there is another student to process.
            System.out.print("\n\nIs there another student to process? ");
            userResponseCh = keyboard.nextLine().toUpperCase().charAt(0);
         }
         while (userResponseCh == 'Y');

       	// Return reference to the ArrayList
         return listOfScientist;
      } 
    public static void sortDataByName(ArrayList<Scientist> listOfScientist)
      {
      	// Local variables
         boolean weAreDone = false;		// Are we done with the sorting?
         Scientist swapScientist;				// For swapping two Students
         String firstName;					// Name of first student in comparison
         String secondName;				// Name of second student in comparison
         int pass;							// Number of pass we are now doing
         int passLimit = listOfScientist.size() - 1;
      											// Maximum number of passes we
      											// need to do

      	// Logic ...
      	// Create an object for swapStudent to reference.
         swapScientist = new Scientist();

      	// Perform the passes through the ArrayList
         for (pass = 1; (weAreDone == false) && (pass <= passLimit);
         	  pass++)
         {
            weAreDone = true;	// If no swaps occur during this pass,
         							// the ArrayList is sorted

         	// The inner loop performs a pass
            for (int i = 0; i < (listOfScientist.size() - pass); i++)
            {
            	// Get the names for the two students being compared
               firstName = listOfScientist.get(i).getScientistName();
               secondName = listOfScientist.get(i+1).getScientistName();

            	// Swap two Students if they are out of order
               if (firstName.compareTo(secondName) > 0)
               {
               	// They are out of order. Swap 'em
                  swapScientist = listOfScientist.get(i);
                  listOfScientist.set(i, listOfScientist.get(i+1));
                  listOfScientist.set(i+1, swapScientist);
                  weAreDone = false;  // We ain't necessarily done yet
               }
            }  // end inner loop
         }  // end outer loop
      }
    public static void performSearches(ArrayList<Scientist> listOfScientist)
      {
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

      	// Create DecimalFormat object for displaying final averages
         DecimalFormat output = new DecimalFormat("##0.0");

      	// Inform Grump the search phase is ready to begin.
         System.out.println("\n\nThe program is now entering the search phase.");

      	// Do at least one search, then ask Grump if he wants to do another
         do
         {
         	// Ask Grump to enter the name of a student
            System.out.print("\nPlease enter name of student: ");
            searchKey = keyboard.nextLine();
            searchKey = searchKey.toUpperCase();

         	// Pass search key to binary search algorithm
            whereFound = binarySearch(listOfScientist, searchKey);

         	// Give results to Grump
            if (whereFound == -1)
            {
               System.out.println("This student's data was not found.");
            }
            else
            {
               System.out.println("This student's final average was " +
                  output.format(listOfScientist.get(whereFound).getListOfScientist()));
            }

         	// Ask Grump if he wants to enter another name.
            System.out.print("\nDo you want to enter another name? (Y/N) ");
            userResponseCh = keyboard.nextLine().toUpperCase().charAt(0);
         }
         while (userResponseCh == 'Y');
      }
    
    public static int binarySearch(ArrayList<Scientist> listOfScientist,
                                     String searchKey)
      {
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
         String midScientistName;	// Name of Student at the middle element

      	// Logic ...
      	// Inititalize variables to set up for search process
         first = 0;
         last = listOfScientist.size() - 1;
         found = false;
         whereFound = -1;

      	// Do the searching
         while (!found && first <= last)
         {
         	// Calculate the index of the middle element
         	// and get the name of the Student located there
            middle = (first + last) / 2;
            midScientistName = listOfScientist.get(middle).getScientistName();

         	// Either we found it, or we need to update
         	// either first or last
            if (midScientistName.equals(searchKey))
            {
            	// We found it
               found = true;
               whereFound = middle;
            }
            else if (midScientistName.compareTo(searchKey) > 0)
            {
            	// Let's search the top half of the ArrayList
               last = middle - 1;
            }
            else
            {
            	// Let's search the bottom half of the ArrayList
               first = middle + 1;
            }
         }  // end while

      	// Return where searchKey was found or -1
         return whereFound;
      }
}
