/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

/**
 *
 * @author Arod6
 */
public class Person {
    private int age;
    private char gender;
    private String location;
   
    
    public Person(){
        age=0;
        gender='0';
        location="none";
    }
    
    public Person(int age, char gender, String location){
        this.age = age;
        this.gender= gender;
        this.location= location;
       
    }

    Person(int age) {
        this.age= age;
        gender='0';
        location="none";
    }

    public String toString() {
        return "Person{" + "age=" + age + ", gender=" + gender + ", location=" + location + '}';
    }
    
}
