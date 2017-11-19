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
public abstract class Element {
     public String getClassName()
    {
        return getClass().getSimpleName();
    }
    public abstract void readIn();
    public abstract void Display();
    public abstract boolean equals(Element dobj);
    public abstract Element clone();
    
}
