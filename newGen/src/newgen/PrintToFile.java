/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgen;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Arod6
 */
class PrintToFile {

    String brand;
    double price;

    JButton buttons[] = new JButton[5];
    String names[] = {"Foo", "Bar", "Baz", "Fob", "Bao"};

    public PrintToFile() {

    }

    public void printToFile(String brand, double price) throws IOException {
        //PrintWriter pw = new PrintWriter(new FileWriter("BarMenu.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Arod6\\Desktop\\BarMenu.xlsx"));
        for (int i = 0; i < 30; i++) {
            pw.print(brand + " " + price + "\n");
        }

        pw.close();
    }
    public void printToFile(String brand, String price) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Arod6\\Desktop\\BarMenu.xlsx"));
        for (int i = 0; i < 30; i++) {
            pw.print(brand + " " + price + "\n");
        }

        pw.close();
    }

    public void readFromFile() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("BarMenu.txt");
        int count;

        char chrs[] = new char[1];

        do {

            count = fr.read(chrs);
            for (int i = 0; i < count; i++) {
                System.out.print(chrs[i]);
            }
        } while (count != -1);

        fr.close();

    }

    public ArrayList<String> readFromFileToArray() throws FileNotFoundException, IOException {
        Scanner kb = new Scanner(new File("C:\\Users\\Arod6\\Desktop\\BarMenu.xlsx"));

        ArrayList<String> list = new ArrayList<>();
        while (kb.hasNextLine()) {
            list.add(kb.nextLine());
        }
        kb.close();
        for (String string : list) {
            System.out.println(string);
        }
        return list;
    }
    public ArrayList<String> readFromExcelToArray() throws FileNotFoundException, IOException {
        Scanner kb = new Scanner(new File("C:\\Users\\Arod6\\Desktop\\BarMenu.xlsx"));

        ArrayList<String> list = new ArrayList<>();
        while (kb.hasNextLine()) {
            list.add(kb.nextLine());
        }
        kb.close();
        for (String string : list) {
            System.out.println(string);
        }
        return list;
    }
    
    
    
}
