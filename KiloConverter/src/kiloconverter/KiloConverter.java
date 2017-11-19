/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiloconverter;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//The kiloConverter class displays a JFrame that lets the user enter a distance in kilometers.
//When the calculate button is clicked, a dialog box is displayed with the distance coverted to miles.

public class KiloConverter extends JFrame
{
   private JPanel panel; //To reference a panel
   private JLabel messageLabel; //To reference a label
   private JTextField kiloTextField; //To reference a text field
   private JButton calcButton; //To reference a button
   private final int WINDOW_WIDTH = 310; //window width
   private final int WINDOW_HEIGHT = 100; //wind height
   
   //constructor
   
   public KiloConverter()
   {
      //set the window title.
      setTitle("Kilometer Converter");
      
      //set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      //specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //build the panel and add it to the frame.
      buildPanel();
      
      //add the panel to the frame's content pane.
      add(panel);
      
      //display the window.
      setVisible(true);
      
   }
   
   //The buildPanel method adds a label, a text field, and a button to a panel.
   private void buildPanel()
   {
      //create a label to disply instructions.
      messageLabel = new JLabel("Enter a distance in kilometers.");
      
      //create a text field 10 characters wide.
      kiloTextField = new JTextField(10);
      
      //create a button with the caption "Calculate"
      calcButton = new JButton("Calculate");
      
      //add an action listener to the button
      calcButton.addActionListener(new CalcButtonListener());
      
      //create a JPanel object and let the panel field reference it.
      panel = new JPanel();
      
      //add the label, text field, and button components to the panel
      panel.add(messageLabel);
      panel.add(kiloTextField);
      panel.add(calcButton);
   }
      
      //CalcButtonListener is an action listener class for the Calculate button.
      
   private class CalcButtonListener implements ActionListener
   {
      //the actionPerformed method executes when the user clicks on the Calculate button.
         
      public void actionPerformed(ActionEvent e)
      {
         final double CONVERSION = 0.6214;
         String input; //to hold the user's input
         double miles; //the number of miles
            
         //get the textenetered by the user into the text field
         input = kiloTextField.getText();
           
         //Convert the input to miles
         miles = Double.parseDouble(input)*CONVERSION;
            
         //display the result
         JOptionPane.showMessageDialog(null,input+"kilmeters is "+miles +" miles.");
      }
   }
      
      //main method
   public static void main(String[] args)
   {
      new KiloConverter();
   }
}
   
   