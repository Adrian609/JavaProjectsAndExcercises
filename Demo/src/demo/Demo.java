/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Arod6
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initializing all PR1 string, ints, double to 0
        payroll PR1 = new payroll();
        // Gave values to Pr2 String, int and doubles
        payroll PR2 = new payroll("Adrian", 1001, 30, 20);
        //Gave values to PR3 string and int
        payroll PR3 = new payroll("Steve", 1010);

        System.out.println("PR1's name is " + PR1.getName() + ". ID is " + PR1.getID() + " hour is " + PR1.getHour() + ". Rate is " + PR1.getRate() + ". Gross pay " + PR1.grossPay());

        System.out.println("PR2's name is " + PR2.getName() + ". ID is " + PR2.getID() + " hour is " + PR2.getHour() + ". Rate is " + PR2.getRate() + ". Gross pay " + PR2.grossPay());

        System.out.println("PR3's name is " + PR3.getName() + ". ID is " + PR3.getID() + " hour is " + PR3.getHour() + ". Rate is " + PR3.getRate() + ". Gross pay " + PR3.grossPay());
        
        System.out.println("PR1 Grosspay: "+PR1.overTime()+"PR2 Grosspay: "+PR2.overTime()+"PR3 Grosspay: "+PR3.overTime());
    }

}
