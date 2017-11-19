/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordercalculateorgui;

/**
 *
 * @author Arod6
 */
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

//The ToppingPanel class allows the user to select the toppings for the bagel

public class ToppingPanel extends JPanel {

    //The following constants are used to indicate the cost of toppings

    public final double CREAM_CHEESE = 0.50;
    public final double BUTTER = 0.25;
    public final double PEACH_JELLY = 0.75;
    public final double BLUEBERRY_JAM = 0.75;

    private JCheckBox creamCheese; //to select cream cheese
    private JCheckBox butter; //to select butter
    private JCheckBox peachJelly; //to select peach jelly
    private JCheckBox blueberryJam; //to select blueberry jam

    //constructor
    public ToppingPanel() {
        //create a gridLayout manager with four rows and one column.
        setLayout(new GridLayout(4, 1));

        //create the check boxes
        creamCheese = new JCheckBox("Cream cheese");
        butter = new JCheckBox("Butter");
        peachJelly = new JCheckBox("Peach jelly");
        blueberryJam = new JCheckBox("Blueberry jam");

        //add a border around the panel.
        setBorder(BorderFactory.createTitledBorder("Toppings"));

        //add the check boxes to the panel.
        add(creamCheese);
        add(butter);
        add(peachJelly);
        add(blueberryJam);

    }

    public double getToppingCost() {
        double toppingCost = 0.0;

        if (creamCheese.isSelected()) {
            toppingCost += CREAM_CHEESE;
        }
        if (butter.isSelected()) {
            toppingCost += BUTTER;
        }
        if (peachJelly.isSelected()) {
            toppingCost += PEACH_JELLY;
        }
        if (blueberryJam.isSelected()) {
            toppingCost += BLUEBERRY_JAM;
        }

        return toppingCost;
    }
}
