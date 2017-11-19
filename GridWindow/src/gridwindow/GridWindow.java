/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridwindow;
import java.awt.GridLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame;

//this class demonstrates the gridlayout manager

public class GridWindow extends JFrame
{
   private final int WINDOW_WIDTH = 400; //Window width
   private final int WINDOW_HEIGHT = 200; //Window height
   
   //constructor
   
   public GridWindow()
   {
      //set the title bar text
      setTitle("Grid Layout");
      
      //set the size of the window
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      
      //specify an action for the close button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //add a gridlayout manager to the content pane
      setLayout(new GridLayout(2,3));
      
      //create six buttons
      JButton button1 = new JButton("Button 1");
      JButton button2 = new JButton("Button 2");
      JButton button3 = new JButton("Button 3");
      JButton button4 = new JButton("Button 4");
      JButton button5 = new JButton("Button 5");
      JButton button6 = new JButton("Button 6");
      
      //option 1: add the six buttons to the content pane
      add(button1);
      add(button2);
      add(button3);
      add(button4);
      add(button5);
      add(button6);
      
      //option 2: create six labels
      //JLabel label1 = new JLabel("This is cell 1.");
      //JLabel label2 = new JLabel("This is cell 2.");
      //JLabel label3 = new JLabel("This is cell 3.");
      //JLabel label4 = new JLabel("This is cell 4.");
      //JLabel label5 = new JLabel("This is cell 5.");
      //JLabel label6 = new JLabel("This is cell 6.");
      
      //option 2: create six panels
      //JPanel panel1 = new JPanel();
      //JPanel panel2 = new JPanel();
      //JPanel panel3 = new JPanel();
      //JPanel panel4 = new JPanel();
      //JPanel panel5 = new JPanel();
      //JPanel panel6 = new JPanel();
      
      //option 2:add the labels to the panels
      //panel1.add(label1);
      //panel2.add(label2);
      //panel3.add(label3);
      //panel4.add(label4);
      //panel5.add(label5);
      //panel6.add(label6);
      
      //option 2:add the buttons to the panels
      //panel1.add(button1);
      //panel2.add(button2);
      //panel3.add(button3);
      //panel4.add(button4);
      //panel5.add(button5);
      //panel6.add(button6);
      
      //option 2:add the panels to the content pane
      //add(panel1);
      //add(panel2);
      //add(panel3);
      //add(panel4);
      //add(panel5);
      //add(panel6);
      
      //display the window
      setVisible(true);
      
   }
   
   //The main method creates an instance of the GridWindow class, causing it to display its window
   
   public static void main(String[] args)
   {
      new GridWindow();
   }
}
