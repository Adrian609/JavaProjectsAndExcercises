/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgen;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author Arod6
 */
public class GenerateButtons extends JFrame {

    public GenerateButtons(int rows, int cols, String[] brands, double[] prices) {

        Container pane = getContentPane();

        pane.setLayout(new GridLayout(rows, cols, 1, 1));

        for (int i = 0; i < brands.length; i++) {
            JButton button = new JButton(brands[i] + " \n" + prices[i]);
            button.addActionListener(new ButtonListener());
            pane.add(button);

        }

    }

    public GenerateButtons(int rows, int cols, ArrayList<String> list ) {

        Container pane = getContentPane();

        pane.setLayout(new GridLayout(rows, cols, 5, 5));
        
        for (String string:list) {
            JButton button = new JButton(string);
            button.addActionListener(new ButtonListener());
            pane.add(button);

        }

    }

    private static class ButtonListener implements ActionListener {

        boolean toggle = true;

        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton source = (JButton) ae.getSource();
            String buttonText = source.getText();
            String tempString[] = buttonText.split(" ");
            String brand = tempString[0];
            double price = Double.parseDouble(tempString[1]);

            JOptionPane.showMessageDialog(null, "Product " + brand + " Price $" + price);

        }
    }

}
