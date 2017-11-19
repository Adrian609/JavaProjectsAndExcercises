/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmtsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ar839271
 * 4/21/2016
 */
public class BMTSystem extends Scientist {

    public static final Scanner KB = new Scanner(System.in);
    public static final Scientist s = new Scientist();
    //public static ArrayList<Scientist> listOfScientist;
    //public static final ArrayList<Scientist> origScientistList = new ArrayList<>();

    public static void main(String[] args) throws CannotDisplayException, DuplicateObjectException {

        ElementSet anElementSet = new ElementSet();
        boolean weAreDone = false;
        

        while (!weAreDone) {

            boolean wantsToQuit = false;
            boolean validChoice = false;
            char menuChoice;
            String[] options = {"- Add a Scientists",
                "- Add a Composer   ",
                "- Display the names of all of the scientists",
                "- Display the names of all of the Composers",
                "- Display all data for a specific scientist",
                "- Display the data for a particular Composer",
                "- Edit the data for a particular Scientist",
                "- Edit the data for a particular Composer",
                "- Quit"};
            do {
                System.out.println("|------------------------------------------------------|\n"
                        + "|\"BEAUTIFUL MINDS TRACKING SYSTEM DATA MENU\"|\n"
                        + "|------------------------------------------------------|");
                for (int i = 0; i < 9; i++) {
                    System.out.println("| " + (i + 1) + ") " + options[i]);
                }
                System.out.print("Please select an option: ");
                menuChoice = KB.nextLine().charAt(0);
                if (menuChoice <= '9' && menuChoice >= '0') {
                    validChoice = true;
                } else {
                    System.out.println("Sorry, that is not a valid choice. Try again.");
                }
            } while (!validChoice);

            switch (menuChoice) {
                case '1'://Add Scientist
                    addScientist(anElementSet);
                    break;
                case '2'://Add Composer
                    addComposer(anElementSet);
                    break;
                case '3'://Display the names of all of the scientists
                    displayAllScientist(anElementSet);
                    break;
                case '4'://Display all data for a specific scientist
                    displayAllComposer(anElementSet);
                    break;
                case '5'://Display the names of the scientists that belong to a particular field
                    findScientist(anElementSet);
                    break;
                case '6'://Display the names of scientists associated with a specific great idea
                    findComposer(anElementSet);

                case '7'://Display the names of the scientists that belong to a particular field
                    editScientist(anElementSet);
                    break;
                case '8'://Display the names of scientists associated with a specific great idea
                    editComposer(anElementSet);
                case '9':
                    System.out.println("Are you sure you would like to quit? Y/N");
                    String isThereAnother = KB.nextLine().toUpperCase();
                    switch (isThereAnother) {
                        case "Y":
                            wantsToQuit = true;
                            break;
                        case "N":
                            wantsToQuit = false;
                            break;
                        default:
                            System.out.println("You have not entered a valid response");
                            break;
                    }

            }
        }
    }

    

    public static void performSearches(ArrayList<Scientist> listOfScientist) {
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
        System.out.println("\nThe program is now entering the search phase.");

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
// not sure if i need binary search 

    public static int binarySearch(ArrayList<Scientist> listOfScientist,
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
            midStuName = listOfScientist.get(middle).getName();

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

    public static ArrayList<Scientist> bubbleSort(ArrayList<Scientist> listOfScientist) {
        int num = listOfScientist.size();

        do {
            int newNum = 0;
            for (int i = 1; i <= num - 1; i++) {
                String stringA = listOfScientist.get(i - 1).getName();
                String stringB = listOfScientist.get(i).getName();

                if (stringA.compareTo(stringB) > 0) {
                    Scientist temp = listOfScientist.get(i);
                    listOfScientist.set(i, listOfScientist.get(i - 1));
                    listOfScientist.set(i - 1, temp);
                    newNum = i;
                }
            }
            num = newNum;
        } while (num != 0);

        return listOfScientist;
    }
//display menu and use switch to call methods

// quits program
    public static void addScientist(ElementSet aSet) throws DuplicateObjectException, CannotDisplayException {
        Element anElement;
        anElement = new Scientist();
        anElement.readIn();
        try {
            aSet.add(anElement);
        } catch (DuplicateObjectException ex) {
            System.out.println("The Scientist you specified is already in the set.");
        }
    }

    public static void addComposer(ElementSet aSet) throws DuplicateObjectException, CannotDisplayException{
        Element anElement;
        anElement = new Composer();
        anElement.readIn();
        try {
            aSet.add(anElement);
        } catch (DuplicateObjectException ex) {
            System.out.println("The soup you specified is already in the set.");
        }
    }

    public static boolean getQuit() {
        System.out.println("\"Are you sure you want to quit?\"");
        if (KB.nextLine().toUpperCase().charAt(0) == 'N') {
            return false;
        } else {
            System.out.println("Good bye");
            return true;
        }
    }

    public static void displayAllScientist(ElementSet anESet) {
        Element anElement3;
        Scientist aScientist;
        String currScientist;
        int scientistCount = 0;

        for (int i = 0; i < anESet.size(); i++) {
            anElement3 = anESet.getCurrent();
            currScientist = anElement3.getClassName();
            if (currScientist.equals("Scientist")) {
                scientistCount++;
                aScientist = (Scientist) anElement3;
                System.out.println("Name: " + aScientist.getName());
            }
        }
        if (scientistCount == 0) {
            System.out.println("There were no Scientist in this set");
        }
    }

    public static void displayAllComposer(ElementSet anESet) {
        Element anElement4;
        Composer aComposer;
        String currComposer;
        int Count = 0;

        for (int i = 0; i < anESet.size(); i++) {
            anElement4 = anESet.getCurrent();
            currComposer = anElement4.getClassName();
            if (currComposer.equals("Composer")) {
                Count++;
                aComposer = (Composer) anElement4;
                System.out.println("Name: " + aComposer.getName());
            }
        }
        if (Count == 0) {
            System.out.println("There were no Composers in this set");
        }
    }

    public static void findScientist(ElementSet anElementSet) throws CannotDisplayException {
        boolean scientistWasFound = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the name of the Scientist you are looking for?");
        String LocalScientistName = keyboard.nextLine().toUpperCase();
        Scientist enteredScientist = new Scientist();
        enteredScientist.setScientistName(LocalScientistName);
        anElementSet.displayAnObject(enteredScientist);
        if (!anElementSet.displayAnObject(enteredScientist)) {
            scientistWasFound = true;
        }
        if (scientistWasFound == true) {
            System.out.println("This Scientist could not be found.");
        }
    }

    public static void findComposer(ElementSet anElementSet) throws CannotDisplayException {
        boolean wasFound = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the name of the Composer you are looking for?");
        String LocalComposerName = keyboard.nextLine().toUpperCase();
        Composer enteredComposer = new Composer();
        enteredComposer.setName(LocalComposerName);
        anElementSet.displayAnObject(enteredComposer);
        if (!anElementSet.displayAnObject(enteredComposer)) {
            wasFound = true;
        }
        if (wasFound == true) {
            System.out.println("This Composer could not be found.");
        }
    }

    public static void editScientist(ElementSet anElementSet) {
        boolean scientistReplaced = false;
        System.out.println("What is the name of the Scientist you want to replace?");
        String scientistName = KB.nextLine().toUpperCase();
        Scientist soughtScientist = new Scientist();
        soughtScientist.setScientistName(scientistName);
        System.out.println("What is the information of the Scientist you want to replace it with?");
        Scientist newScientist = new Scientist();
        newScientist.readIn();
          try {
            if (anElementSet.isMemberOf(newScientist)) {
                throw new DuplicateObjectException();
            }
        } catch (DuplicateObjectException e) {
            System.out.println("The Soup is already in the set.");
        }
          anElementSet.replaceAnObject(soughtScientist, newScientist);
          System.out.println("Succesfully Edited!!!");
        return;
    }

    public static void editComposer(ElementSet anElementSet) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the name of the Composer you want to replace?");
        String composerName = keyboard.nextLine().toUpperCase();
        Composer soughtComposer = new Composer();
        soughtComposer.setName(composerName);
        System.out.println("What is the information of the Composer you want to replace it with?");
        Composer newComposer = new Composer();
        newComposer.readIn();
       try {
            if (anElementSet.isMemberOf(newComposer)) {
                throw new DuplicateObjectException();
            }
        } catch (DuplicateObjectException e) {
            System.out.println("The Composer is already in the set.");
        }
       anElementSet.replaceAnObject(soughtComposer, newComposer);
        System.out.println("Succesfully Replaced!!!");

    }

}
