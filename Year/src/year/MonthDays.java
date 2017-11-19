package year;

import java.util.Scanner;

/**
 *
 * @author Arod6
 */
class MonthDays {

    int month;
    int year;
    int daysInMonth;

    //initialize to zero
    public MonthDays() {
        month = 0;
        year = 0;
        daysInMonth = 0;
    }

    // set reference values?
    public MonthDays(int y, int m, int d) {
        year = y;
        month = m;
        daysInMonth = d;
    }

    //acessors? the setters and getters
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
// reads in information for the different fields

    void readIn() {
        Scanner KB = new Scanner(System.in);
        System.out.println("Please enter year?");
        year = KB.nextInt();
        System.out.println("Please enter month?");
        month = KB.nextInt();
        System.out.println("The year and month you entered is \"year; " + year + "\", \"month:" + month + "\"");
    }
// calculate if the year is a leap year
  
    public int isLeapYear() {

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        return year;
    }
// calculates the days in month

    public int daysMonth() {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else if (month == 2) {
            boolean isleapYear = true;
            daysInMonth = (isleapYear) ? 29 : 28;
        } else {
            daysInMonth = 31;
        }
        return daysInMonth;
    }
// displayMEthod() to call and output user info

    void display() {
        /* first one shows is leap year and eturns year 
         for the isLeapYear(). daysMonth() returns the days in a month*/
        System.out.println("1 :Year: " + isLeapYear() + " Days in Month: " + daysMonth());
        //just calling the field, year and daysInMonth 
        System.out.println("2 :Year: " + year + "Days in Month: " + daysInMonth);
    }

}
