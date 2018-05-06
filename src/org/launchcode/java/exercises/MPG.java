package org.launchcode.java.exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        double miles;
        double gas_used;
        double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        miles = in.nextDouble();
        System.out.println("Enter gallons of fuel used: ");
        gas_used = in.nextDouble();

        mpg = miles / gas_used;
        System.out.println("You are getting " + mpg + " miles per gallon of fuel");

    }
}
