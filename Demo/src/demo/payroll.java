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
public class payroll {

    private String name;
    private int ID;
    private double rate;
    private double hour;

    
    //PR1 is initialized fields to Null and zero
    public payroll() {
        name = null;
        ID = 0;
        rate = 0;
        hour = 0;
    }

    //PR2 van recieve values in all fields
    public payroll(String n, int id, double r, double h) {
        name = n;
        ID = id;
        rate = r;
        hour = h;
    }

    // PR3 name and ID can recieve values, Rate and hour iitialized to 40
    public payroll(String n, int id) {
        name = n;
        ID = id;
        rate = 40;
        hour = 40;

    }
    
    //sets object name to n
    public void setName(String n){
        name =n;
    }
    //sets int ID to id
    public void setID(int id){
        ID =id;
    }
    // Sets double rate to r
    public void setRate(double r){
        rate =r;
    }
    //Sets doule hours to h
    public void setHour(double h){
        hour =h;
    }
    //get name returns name
    String getName() {
        return name;
    }
    //get ID returns ID
    int getID() {
        return ID;
    }
    //getRate to return rate
    double getRate() {
        return rate;
    }
    //double get Hour
    double getHour() {
        return hour;
    }
    //gross pay returns hours multiplied by rate
    public double grossPay(){
        return hour*rate;
    }
    public double overTime(){
        return grossPay()*1.5;
    }
   

}
