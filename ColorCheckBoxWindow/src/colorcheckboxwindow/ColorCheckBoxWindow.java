/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorcheckboxwindow;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//the ColorCheckBoxWindow class demonstrates how check boxes can be used
public class ColorCheckBoxWindow extends JFrame {

    private JLabel messageLabel; //a message to the user
    private JCheckBox yellowCheckBox; //to select yellow background
    private JCheckBox redCheckBox; //to select red foreground
    private final int WINDOW_WIDTH = 300; //window width
    private final int WINDOW_HEIGHT = 100; //window height

    //constructor
    public ColorCheckBoxWindow() {
        //set the textfor the title bar
        setTitle("Color Check Boxes");

        //set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create a label
        messageLabel = new JLabel("Selecte the check boxes to change colors.");

        //create the check boxes
        yellowCheckBox = new JCheckBox("Yellow background");
        redCheckBox = new JCheckBox("Red foreground");

        //add an item listener to the check boxes
        yellowCheckBox.addItemListener(new CheckBoxListener());
        redCheckBox.addItemListener(new CheckBoxListener());

        //add a flowLayout manager to the content pane
        setLayout(new FlowLayout());

        //add the label and check boxes to the content pane
        add(messageLabel);
        add(yellowCheckBox);
        add(redCheckBox);

        //display the window
        setVisible(true);
    }

   //private inner class that handles the event when the user clicks one of the check boxes
    private class CheckBoxListener implements ItemListener {

        public void itemStateChanged(ItemEvent e) {
            //determin which check box was clicked
            if (e.getSource() == yellowCheckBox) {
                //is the yellow check box selected? if so, we want to set the background color to yellow
                if (yellowCheckBox.isSelected()) {
               //the yellow check box was selected. Se the background color for the contet
                    //pane and the two check boxes to yellow
                    getContentPane().setBackground(Color.YELLOW);
                    yellowCheckBox.setBackground(Color.YELLOW);
                    redCheckBox.setBackground(Color.YELLOW);
                } else {
               //the yellow check box was deselected. Set the background color for the content
                    //pane and the two check boxes to light gray.
                    getContentPane().setBackground(Color.LIGHT_GRAY);
                    yellowCheckBox.setBackground(Color.LIGHT_GRAY);
                    redCheckBox.setBackground(Color.LIGHT_GRAY);
                }
            } else if (e.getSource() == redCheckBox) {
                //is the red check box selected? if so, we want to set the foreground color to red
                if (redCheckBox.isSelected()) {
               //the red check box was selected. set the foreground color for the label and 
                    //the two check boxes to red
                    messageLabel.setForeground(Color.RED);
                    yellowCheckBox.setForeground(Color.RED);
                    redCheckBox.setForeground(Color.RED);
                } else {
               //the red check box was deselected. Set the foreground color for the label and 
                    //the two check boxes to black
                    messageLabel.setForeground(Color.BLACK);
                    yellowCheckBox.setForeground(Color.BLACK);
                    redCheckBox.setForeground(Color.BLACK);
                }
            }
        }
    }

    //the main method creates an instance of the ColorCheckBoxWindow class, displaying its window

    public static void main(String[] args) {
        new ColorCheckBoxWindow();
    }
}
