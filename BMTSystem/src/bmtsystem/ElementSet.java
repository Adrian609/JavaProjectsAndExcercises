/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmtsystem;

/**
 *
 * @author ar839271
 */
public class ElementSet {

    Element[] theList;
    private int currentIndex;
    private int currentSize;
    private final int MAXSETSIZE = 100;

    public ElementSet() {
        theList = new Element[MAXSETSIZE];
        currentIndex = -1;
        currentSize = 0;
    }

    //Test if the element added is already a member of element set
    public boolean isMemberOf(Element anElement) {
        String paramClass = anElement.getClassName();
        String currClass;

        for (int i = 0; i < currentSize; i++) {
            currClass = theList[i].getClassName();
            if (currClass.equals(paramClass)) {
                if (theList[i].equals(anElement)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Determine if the list is full
    public boolean isFull() {
        return currentSize == MAXSETSIZE;
    }

    //Determine if the list is empty
    public boolean isEmpty() {
        return currentSize == 0;
    }

    //Returns number of objects in the list
    public int size() {
        return currentSize;
    }

    //returns reference to the current object in list
    public Element getCurrent() {
        int saveIndex = currentIndex;
        if (currentIndex == currentSize - 1) {
            currentIndex = 0;
        } else {
            currentIndex++;
        }
        return theList[saveIndex].clone();
    }

    /*Adds reference to parameter object to list if its not full
     or if the objects not already in the list*/
    public int add(Element anElement) throws DuplicateObjectException, CannotDisplayException {
        if (currentSize == MAXSETSIZE) {
            throw new CannotDisplayException();
        } else if (this.isMemberOf(anElement)) {
            throw new DuplicateObjectException();
        }
        theList[currentSize] = anElement.clone();
        currentSize++;
        if (currentSize == 1) {
            currentIndex = 0;
        }
        return 1;
    }

    //Resets the list to an empty set
    public void clear() {
        for (int i = 0; i < currentSize; i++) {
            theList[i] = null;
        }
        currentIndex = -1;
        currentSize = 0;
    }

    //Displays the objects
    public void display() {
        if (currentSize == 0) {
            System.out.println("There are no objects in the set.");
        } else {
            System.out.println("Here are the objects in the set:");
            for (int i = 0; i < currentSize; i++) {
                theList[i].Display();
                System.out.println("\n");
            }
        }
    }
//This method will search to see if DesiredElement is in the array    

    public boolean displayAnObject(Element anObject) throws CannotDisplayException {
        String paramClass2 = anObject.getClassName();
        boolean weCanDisplay = false;
        for (int i = 0; i < currentSize; i++) {
            Element lookForIt = getCurrent();
            String className = lookForIt.getClassName();
            if (className.equals(paramClass2)) {
                if (lookForIt.equals(anObject)) {
                    lookForIt.Display();
                    return true;
                }
            }

        }
        if (weCanDisplay == false) {
            throw new CannotDisplayException();
        }
        return false;
    }

    //This method will search for soughtobject and if found, add newobject to the array
    public void editAnObject(Element originalObject, Element newObject) throws CannotEditException {
        String paramClass = originalObject.getClassName();
        boolean canWeEdit = false;
        for (int i = 0; i < currentSize; i++) {
            Element DesiredElement = getCurrent();
            String className = DesiredElement.getClassName();
            if (className.equals(paramClass)) {
                if (DesiredElement.equals(originalObject)) {
                    if (isMemberOf(originalObject)) {
                        canWeEdit = true;
                    }
                    theList[i] = newObject.clone();

                }
            }

        }
        if (canWeEdit == false) {
            throw new CannotEditException();
        }
    }

    public boolean replaceAnObject(Element soughtObject, Element newObject) {
        String paramClass = soughtObject.getClassName();
        for (int i = 0; i < currentSize; i++) {
            Element DesiredElement = getCurrent();
            String className = DesiredElement.getClassName();
            if (className.equals(paramClass)) {
                if (DesiredElement.equals(soughtObject)) {
                    theList[i] = newObject.clone();
                    return true;
                }
            }

        }
        return false;
    }
}
