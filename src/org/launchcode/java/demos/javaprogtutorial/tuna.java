package org.launchcode.java.demos.javaprogtutorial;

public class tuna {
    // Part of multiple classes 14: Using Multiple classes (simpleMessage + otherMessage)
    public void simpleMessage() {
        System.out.println("This is another class");
    }
    // Part of multiple classes:
    public void otherMessage() {
        int a = 4;
        double b = 2.3;
        System.out.println(a*b);
    }


    // Methods with Parameters
    public void simpleMessage2(String name) {
        System.out.println("Hello " + name);
    }

    // Many Methods and Instances
    private String girlName;
    public void setName(String name) {
        girlName = name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("Your first gf was %s", getName());
    }




}