/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgen;

import java.awt.Container;
import java.awt.GridLayout;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JButton;
import java.util.*;
import static java.util.Collections.list;
import javax.swing.JFrame;

/**
 *
 * @author Arod6
 */
public class NewGen extends JFrame {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        PrintToFile mockFile = new PrintToFile();

        double price = Math.random()*10-40;
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        String aPrice = format.format(price);
        
        //mockFile.printToFile("Bacardi", aPrice);
        ArrayList<String> list = mockFile.readFromFileToArray();
        //mockFile.readFromFile();
        mockFile.readFromFileToArray();

        int rows = 5;
        int cols = 3;
        GenerateButtons gt = new GenerateButtons(rows, cols, list);
//        String brands[] = {"Bacardi", "Rum", "Jose Cuervo ", "Bacardi"};
//        double prices[] = {2.49, 3.29, 4.69, 5.00};
//
//        GenerateButtons gt = new GenerateButtons(rows, cols, brands, prices);
        gt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
        gt.pack();
        gt.setVisible(true);
    }

}
