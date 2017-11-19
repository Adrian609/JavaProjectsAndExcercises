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
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//The CoffeePanel class allows the user to select coffee

public class CoffeePanel extends JPanel {

    //The following constants are used to indicate the cost of coffee

    public final double NO_COFFEE = 0.0;
    public final double REGULAR_COFFEE = 1.25;
    public final double DECAF_COFFEE = 1.25;
    public final double CAPPUCCINO = 2.00;

    private JRadioButton noCoffee; //to select no coffee
    private JRadioButton regularCoffee; //to select regular coffee
    private JRadioButton decafCoffee; //to select decaf
    private JRadioButton cappuccino; //to select cappuccino
    private ButtonGroup bg; //radio button group

   //constructor
    public CoffeePanel() {
        //create a gridLayout manager with four rows and one column
        setLayout(new GridLayout(4, 1));

        //create the radioButtons.
        noCoffee = new JRadioButton("None");
        regularCoffee = new JRadioButton("Regular coffee", true);
        decafCoffee = new JRadioButton("Decaf coffee");
        cappuccino = new JRadioButton("Cappuccino");

        //Group the radio buttons
        bg = new ButtonGroup();
        bg.add(noCoffee);
        bg.add(regularCoffee);
        bg.add(decafCoffee);
        bg.add(cappuccino);

        //add a border around the panel
        setBorder(BorderFactory.createTitledBorder("Coffee"));

        //add the radio buttons to the panel
        add(noCoffee);
        add(regularCoffee);
        add(decafCoffee);
        add(cappuccino);
    }

    public double getCoffeeCost() {
        double coffeeCost = 0.0;

        if (noCoffee.isSelected()) {
            coffeeCost = NO_COFFEE;
        } else if (regularCoffee.isSelected()) {
            coffeeCost = REGULAR_COFFEE;
        } else if (decafCoffee.isSelected()) {
            coffeeCost = DECAF_COFFEE;
        } else if (cappuccino.isSelected()) {
            coffeeCost = CAPPUCCINO;
        }

        return coffeeCost;
    }
}

