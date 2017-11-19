/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joesautomotive;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Arod6
 */
class GreetingPanel extends JPanel {

    private JLabel greeting; //to display a greating

    //constructor
    public GreetingPanel() {
        //create the label
        greeting = new JLabel("Welcome to Joes Automotive");

        //add the label to this panel
        add(greeting);
    }
}
