/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classex2;

/**
 *
 * @author Arod6
 */
class Grades {

    int[] scores = {5, 10, 15, 20, 25};
    int score;
    double total;
    double average;

    Grades() {
        score = 0;
        total = 0;
        average = 0;
    }

    Grades(int scores) {
        score = scores;
        total = 0;
        average = 0;
    }

    double getTotal() {

        for (int i = 0; i < score; i++) {
            total += i;
        }
        return total;
    }

    double getAverage() {
        average = total / scores.length;
        return average;
    }
}
