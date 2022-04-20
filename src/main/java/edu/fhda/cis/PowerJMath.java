/*
 * Hiep Tuan Luong
 * Class and Section: CIS 35A - Java Programming
 * Assignment 1: 6.22 (Approximate the square root) https://deanza.instructure.com/courses/23660/files/6452334/download?wrap=1
 * Due:
 * Submitted:
 */

package edu.fhda.cis;

public class PowerJMath {
    static double accuracyRate, lastGuess, nextGuess;

    public PowerJMath(double accuracyRate) {
        this.accuracyRate = accuracyRate;
        lastGuess = 1;
    }

    public static double sqrt(long n) {
        double diff = Math.abs(nextGuess - lastGuess);
        System.out.println("diff = " + diff);
        while (diff > accuracyRate) {
            System.out.println("n = " + n);
            System.out.println("lastGuest: " + lastGuess);
            nextGuess = (lastGuess + n / lastGuess) / 2;
            System.out.println("nextGuest: " + nextGuess);
        }
        return nextGuess;
    }
}
