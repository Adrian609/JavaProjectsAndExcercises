/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricconverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//the metricConverter class lets the user enter a distance in kilometers. 
//Radio buttons can be selected to convert the kilometers to miles, feet, or inches.
public class MetricConverter extends JFrame {

    private JPanel panel; //a holding panel
    private JLabel messageLabel; //a message to the user
    private JTextField kiloTextField; //to hold user input
    private JRadioButton milesButton; //to convert to miles
    private JRadioButton feetButton; //to convert to feet
    private JRadioButton inchesButton; //to convert to inches
    private ButtonGroup radioButtonGroup; //to group radio buttons
    private final int WINDOW_WIDTH = 400; //window width
    private final int WINDOW_HEIGHT = 100; //window height

    //constructor
    public MetricConverter() {
        //set the title
        setTitle("Metric Converter");

        //set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //build the panel and add it to the frame.
        buildPanel();

        //add the panel to the frame's content pane
        add(panel);

        //display the window
        setVisible(true);
    }

    //the buildPanel method adds a label, text field, and three radio buttons to a panel
    private void buildPanel() {
        //create the label, text field, and radio buttons
        messageLabel = new JLabel("Enter a distance in kilometers");
        kiloTextField = new JTextField(10);
        milesButton = new JRadioButton("Convert to miles");
        feetButton = new JRadioButton("Convert to feet");
        inchesButton = new JRadioButton("Convert to inches");

        //group the radio buttons
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(milesButton);
        radioButtonGroup.add(feetButton);
        radioButtonGroup.add(inchesButton);

        //add action listeners to the radio buttons
        milesButton.addActionListener(new RadioButtonListener());
        feetButton.addActionListener(new RadioButtonListener());
        inchesButton.addActionListener(new RadioButtonListener());

        //create a panel and add the components to it
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(milesButton);
        panel.add(feetButton);
        panel.add(inchesButton);
    }

   //private inner class that handles the event when the user clicks one of the radio buttons
    private class RadioButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String input; //to hold the user's input
            String convertTo = ""; //the units we are converting to 
            double result = 0.0; //to hold the conversion

            //get the kilometers entered
            input = kiloTextField.getText();

            //determine which radio button was clicked
            if (e.getSource() == milesButton) {
                //Convert to miles
                convertTo = " miles.";
                result = Double.parseDouble(input) * 0.6214;
            } else if (e.getSource() == feetButton) {
                //convert to feet
                convertTo = " feet.";
                result = Double.parseDouble(input) * 3281.0;
            } else if (e.getSource() == inchesButton) {
                //convert to inch
                convertTo = " inches.";
                result = Double.parseDouble(input) * 39370.0;
            }

            //display the convertion
            JOptionPane.showMessageDialog(null, input + " kilometers is " + result + convertTo);
        }
    }

    public static void main(String[] args) {
        new MetricConverter();
    }
}
