/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorwindow;

import java.awt.Color; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//This class demonstrates how to set the background color of a panel and the goreground color of a label
public class ColorWindow extends JFrame {

    private JLabel messageLabel; //to display a message
    private JButton redButton; //changes color to red
    private JButton blueButton; //changes color to blue
    private JButton yellowButton; //changes color to yellow
    private JPanel panel; //a panel to hold components
    private final int WINDOW_WIDTH = 200; //window width
    private final int WINDOW_HEIGHT = 125; //window height

   //constructor
    public ColorWindow() {
        //set the title bar text.
        setTitle("Colors");

        //set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create a label
        messageLabel = new JLabel("Click a button to select a color.");

        //create the three button
        redButton = new JButton("Red");
        blueButton = new JButton("Blue");
        yellowButton = new JButton("Yellow");

        //register an event listener with all 3 buttons.
        redButton.addActionListener(new RedButtonListener());
        blueButton.addActionListener(new BlueButtonListener());
        yellowButton.addActionListener(new YellowButtonListener());

        //create a panel and add the buttons to it
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(redButton);
        panel.add(blueButton);
        panel.add(yellowButton);

        //add the panel to the content pane
        add(panel);

        //display the window
        setVisible(true);

    }
   //private inner class that handles the event when the user clicks a button

    private class RedButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //set the panel's background to red
            panel.setBackground(Color.RED);

            //set the label's text to blue
            messageLabel.setForeground(Color.BLUE);
        }
    }

    private class BlueButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //set the panel's background to red
            panel.setBackground(Color.BLUE);

            //set the label's text to blue
            messageLabel.setForeground(Color.YELLOW);
        }
    }

    private class YellowButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //set the panel's background to red
            panel.setBackground(Color.YELLOW);

            //set the label's text to blue
            messageLabel.setForeground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        new ColorWindow();
    }
}
