/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

import java.util.ArrayList;
import java.util.*;
import java.io.*;
import static java.util.Collections.list;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author Arod6
 */
public class JavaBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String name="Adrain"; 
        helloName(name);
        helloName();
       
    }

    private static String helloName() {
        Scanner kb = new Scanner(System.in);
        String name = kb.next();
       
        return "Hello" + name;
    }

    private static String helloName(String name) {
    return "Hello" + name;
    }

}
