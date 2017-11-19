/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boarderwindow;

import java.awt.BorderLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JPanel;

//This class demonstrates the borderlayout manager
public class BorderWindow extends JFrame {

    private final int WINDOW_WIDTH = 400; //Window width
    private final int WINDOW_HEIGHT = 300; //Window height

   //constructor
    public BorderWindow() {
        //set the title bar text
        setTitle("Border Layout");

        //set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add a borderlayout manager to the content pane
        setLayout(new BorderLayout());

        //create five buttons
        JButton button1 = new JButton("North Button");
        JButton button2 = new JButton("South Button");
        JButton button3 = new JButton("East Button");
        JButton button4 = new JButton("West BUtton");
        JButton button5 = new JButton("Center Button");

        //option 1: add the five buttons to the content pane.
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        add(button3, BorderLayout.EAST);
        add(button4, BorderLayout.WEST);
        add(button5, BorderLayout.CENTER);

      //option 2: create five panels
        //JPanel panel1 = new JPanel();
        //JPanel panel2 = new JPanel();
        //JPanel panel3 = new JPanel();
        //JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

      //option 2: add the buttons to the panels
        //panel1.add(button1);
        //panel2.add(button2);
        //panel3.add(button3);
        //panel4.add(button4);
        //panel5.add(button5);
      //option2: add the five panels to the content pane
        //add(panel1, BorderLayout.NORTH);
        //add(panel2, BorderLayout.SOUTH);
        //add(panel3, BorderLayout.EAST);
        //add(panel4, BorderLayout.WEST);
        //add(panel5, BorderLayout.CENTER);
        //option1: display the window
        setVisible(true);

      //option 2: pack and display the window
        //pack();
        //setVisible(true);
    }

    //the main method creates an instance of the BorderWindow class, casuing it to display its window

    public static void main(String[] args) {
        new BorderWindow();
    }
}
