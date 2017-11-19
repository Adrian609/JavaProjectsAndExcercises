/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

import java.util.Scanner;

/**
 *
 * @author Arod6
 */
class Dog {

    int age = 0;
    private String breed = "N/A";
    private String input;

    public Dog() {

    }

    public Dog(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public int totalAge() {
        int total = age + 10;
        return total;
    }

    public String allDogs() {
        int dogs = 1;
        String[] puppyArray = new String[11];
        char answer = 'y';
        Scanner kb = new Scanner(System.in);
        do {
            System.out.println("Puppy number " + dogs + " : ?");
            input = String.valueOf(dogs);
            System.out.println("Entered:" + input);
            puppyArray[dogs] = input;
            dogs++;
        } while (dogs < 11);
        for (int i = 1; i < puppyArray.length; i++) {
            System.out.println(puppyArray[i]);
        }
        return null;
        
    }

    @Override
    public String toString() {
        return "Dog{" + "age=" + age + ", total age=" + totalAge() + '}';
    }

}
