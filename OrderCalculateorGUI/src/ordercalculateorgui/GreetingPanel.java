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
import javax.swing.JLabel;
import javax.swing.JPanel;

//the greetingPanel class displays a greeting in a panel

public class GreetingPanel extends JPanel {

    private JLabel greeting; //to display a greating

    //constructor
    public GreetingPanel() {
        //create the label
        greeting = new JLabel("Welcome to Brandi's Bagel House");

        //add the label to this panel
        add(greeting);
    }
}
