/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysinamonth;

/**
 *
 * @author Arod6
 */
public class DaysInAMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("<-------Start-------->");
        MonthDays day = new MonthDays();
        System.out.println("\nMAIN METHOD: \nYear is "+day.isLeapYear()+" \nThe day is "+day.daysMonth()+" ");
        System.out.println("<------finish------->");

    }

}
