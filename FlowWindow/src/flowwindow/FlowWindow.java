/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowwindow;

import java.awt.FlowLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame;

//This class demonstrates how to use a flowlayout manager with the content pane.
public class FlowWindow extends JFrame {

    private final int WINDOW_WIDTH = 400; //Window width originally set to 200
    private final int WINDOW_HEIGHT = 150; //Window height orignially set to 105

   //second choice: change width to 400
    //third choice: change width to 100, height to 150
    //fourth choice: change with to 400, then try FlowLayout.LEFT, FlowLayout.RIGHT,FlowLayout.CENTER
   //constructor
    public FlowWindow() {
        //set the title bar text
        setTitle("Flow Layout");

        //set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add a flowlayout manager to the content pane
        setLayout(new FlowLayout());
      //setLayout(new FlowLayout(FlowLayout.LEFT));
        //setLayout(new FlowLayout(FlowLayout.RIGHT));
        //setLayout(new FlowLayout(FlowLayout.CENTER));

        //create three buttons.
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        //add the three buttons to the content pane
        add(button1);
        add(button2);
        add(button3);

        //display the window
        setVisible(true);

    }
      //The main method creates an instance of the flowwindow class, causing it to display its window.

    public static void main(String[] args) {
        new FlowWindow();
    }
}
