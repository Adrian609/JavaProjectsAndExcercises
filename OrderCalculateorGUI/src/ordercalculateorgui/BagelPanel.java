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

//The BagelPanel class allows the user to select either a white or whole wheat bagel

public class BagelPanel extends JPanel {

    //The following constants are used to indicate the cost of each type of bagel.

    public final double WHITE_BAGEL = 1.25;
    public final double WHEAT_BAGEL = 1.50;

    private JRadioButton whiteBagel; //to select white
    private JRadioButton wheatBagel; // to select wheat
    private ButtonGroup bg; //radio button group

    //constructor
    public BagelPanel() {
        //create a gridLayout manager with two rows and one column.
        setLayout(new GridLayout(2, 1));

        //create the radio buttons
        whiteBagel = new JRadioButton("White", true);
        wheatBagel = new JRadioButton("Wheat");

        //group the radio button
        bg = new ButtonGroup();
        bg.add(whiteBagel);
        bg.add(wheatBagel);

        //add a border around the panel
        setBorder(BorderFactory.createTitledBorder("Bagel"));

        //add the radio buttons to the panel
        add(whiteBagel);
        add(wheatBagel);
    }

    public double getBagelCost() {
        double bagelCost = 0.0;

        if (whiteBagel.isSelected()) {
            bagelCost = WHITE_BAGEL;
        } else {
            bagelCost = WHEAT_BAGEL;
        }

        return bagelCost;
    }
}

