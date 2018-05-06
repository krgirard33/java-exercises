package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double pi;
        double area;
        double circumference;
        Scanner in;

        in = new Scanner(System.in);
        radius = 0;
        while (radius<=0) {
            System.out.println("Enter the radius of the circle: ");
            radius = in.nextDouble();
            if (radius <= 0) {
                System.out.println("Must be a positive number");
                System.out.println("Enter the radius of the circle: ");
                radius = in.nextDouble();

            } else {
                pi = 3.14159265;
                area = pi * (radius * radius);
                circumference = pi * (2 * radius);
                System.out.println("The area of the circle is: " + area);
                System.out.println("The circumference of the circle is: " + circumference);
            }
        }

    }
}
