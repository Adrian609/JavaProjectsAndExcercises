/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingticket5000simulator;

/**
 *
 * @author Arod6
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

//The kiloConverter class displays a JFrame that lets the user enter a distance in kilometers.
//When the calculate button is clicked, a dialog box is displayed with the distance coverted to miles.
public class ParkingTicketSimulator extends JFrame {
    //window size
    private final int WINDOW_WIDTH = 930; //window width
    private final int WINDOW_HEIGHT = 300; //wind height
    //font
    Font myFont = new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 40);
    // labels
    private JLabel officerName;
    private JLabel vehicleYear;
    private JLabel vehicleMake;
    private JLabel vehicleModel;
    private JLabel licensePlate;
    //fields
    private JTextField officerNameField;
    private JTextField vehicleYearField;
    private JTextField vehicleMakeField;
    private JTextField vehicleModelField;
    private JTextField licensePlateField;
    //buttons
    private JButton submitButton; //To reference a button
    //layout
    SpringLayout layout = new SpringLayout();
    //main method
    public static void main(String[] args) {
        new ParkingTicketSimulator();
    }

    //constructor
    public ParkingTicketSimulator() {
        //set the window title.
        setTitle("  Parking Ticket 5000 Simulator  ");
        //set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        //specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //build the panel and add it to the frame.
        buildPanel();

        //add the panel to the frame's content pane.
        //display the window.
        setVisible(true);

    }

    //The buildPanel method adds a label, a text field, and a button to a panel.
    private void buildPanel() {

        //create a button with the caption "Calculate"
        submitButton = new JButton("  Submit Ticket  ");
        submitButton.setFont(myFont);

        //create a JPanel object and let the panel field reference it.
        officerName = new JLabel("  Officer Name  ", SwingConstants.LEFT);
        vehicleYear = new JLabel("  Enter Year  ", SwingConstants.LEFT);
        vehicleMake = new JLabel("  Enter Make  ", SwingConstants.LEFT);
        vehicleModel = new JLabel("  Enter Model  ", SwingConstants.LEFT);
        licensePlate = new JLabel("  License Plate  ", SwingConstants.LEFT);
        officerName.setFont(myFont);
        vehicleYear.setFont(myFont);
        vehicleMake.setFont(myFont);
        vehicleModel.setFont(myFont);
        licensePlate.setFont(myFont);
        //create a text field 10 characters wide.
        officerNameField = new JTextField(" Officer Name ");
        vehicleYearField = new JTextField(" Year ");
        vehicleMakeField = new JTextField("  Make ");
        vehicleModelField = new JTextField("  Model ");
        licensePlateField = new JTextField(" License Plate # ");
        //setting fonts
        officerNameField.setFont(myFont);
        vehicleYearField.setFont(myFont);
        vehicleMakeField.setFont(myFont);
        vehicleModelField.setFont(myFont);
        licensePlateField.setFont(myFont);
        //create a JPanel object and let the panel field reference it.
        submitButton.addActionListener(new submitButtonListener());
        //add the label, text field, and button components to the panel
        add(officerName);
        add(officerNameField);
        add(vehicleYear);
        add(vehicleYearField);
        add(vehicleMake);
        add(vehicleMakeField);
        add(vehicleModel);
        add(vehicleModelField);
        add(licensePlate);
        add(licensePlateField);
        add(submitButton);

    }

    //CalcButtonListener is an action listener class for the Calculate button.
    private class submitButtonListener implements ActionListener {
        //the actionPerformed method executes when the user clicks on the Calculate button.

        public void actionPerformed(ActionEvent e) {

            String year, make, model, officerName, licensePlateNumber;

            //get the textenetered by the user into the text field
            officerName = officerNameField.getText();
            year = vehicleYearField.getText();
            make = vehicleMakeField.getText();
            model = vehicleModelField.getText();
            licensePlateNumber = licensePlateField.getText();

            //Convert the input to miles
            //display the result
            JOptionPane.showMessageDialog(null, "The Vehicles information is "
                    + " Officer Name " + officerName
                    + " year: " + year
                    + " make: " + make
                    + " Model: " + model
                    + " License Plate: " + licensePlateNumber
                    + " /n");

        }
    }

}
//