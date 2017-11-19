/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysinamonth;

import java.util.Scanner;

/**
 *
 * @author Arod6
 */
public class MonthDays {

    private int month;
    private int year;
    private int daysInMonth;
    Scanner scan = new Scanner(System.in);

    public MonthDays() {
        System.out.println("Choose year: ");
        year = scan.nextInt();
        System.out.println("Choose Month: ");
        month = scan.nextInt();
        daysInMonth = 0;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setYear(int y) {
        year = y;
    }

    public void setDaysInMonth(int d) {
        daysInMonth = d;
    }

    int getYear() {
        return year;
    }

    int getMonth() {
        return month;
    }

    int getDaysInMonth() {
        return daysInMonth;
    }

    /*public void diplay() {
        System.out.println("Please enter month 1-12: ");
        readIn();
    }*/
    /*private void readIn() {

    }*/

    public int isLeapYear() {
        System.out.println("Start is leap year");
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println("isLeapYear Method: \n"+year + " is a leap year.");
        } else {
            System.out.println("isLeapYear Method: \n"+year + " is not a leap year.");
        }
        return year;
    }

    public int daysMonth() {

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else if (month == 2) {
            boolean leapYear = false;
            daysInMonth = (leapYear) ? 29 : 28;
            System.out.println("daysMonth Method: \nThere are " + daysInMonth + " days in the number month of " + month + " in the year" + year);
        } else {
            daysInMonth = 31;
            System.out.println("daysMonth Method: \nThere are " + daysInMonth + " days in the number month of " + month + " in the year " + year);
        }
        return daysInMonth;
    }

    

}
