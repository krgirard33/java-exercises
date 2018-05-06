package org.launchcode.java.exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        double height;
        double width;
        double area;
        double perimeter;
        Scanner in;

        /*
         * TODO Need to add in validation against negative numbers
         */

        in = new Scanner(System.in);
        System.out.println("Enter the height: ");
        height = in.nextDouble();
        System.out.println("Enter the width: ");
        width = in.nextDouble();

        area = height * width;
        perimeter = (height * 2) + (width * 2);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}
