package org.launchcode.java.demos.javaprogtutorial;
import java.util.Scanner;

public class MultiClass1 {
    public static void main(String[] args) {
        // creates an object
        tuna tunaObject = new tuna();

        // Part of multiple classes: runs simpleMessage from tuna
        tunaObject.simpleMessage();
        // Part of multiple classes: runs otherMessage from tuna
        tunaObject.otherMessage();


        // Methods with Parameters: runs simpleMessage2 from tuna
        Scanner input2 = new Scanner(System.in);
        tuna tunaObject2 = new tuna();
        System.out.println("enter your name: ");
        String name = input2.nextLine();
        tunaObject2.simpleMessage2(name);

        // Many Methods and Instances
        Scanner input3 = new Scanner(System.in);
        tuna tunaObject3 = new tuna();
        System.out.println("Enter name of your first gf: ");
        String firstGF = input3.nextLine();
        tunaObject3.setName(firstGF);
        tunaObject3.saying();

    }


}
