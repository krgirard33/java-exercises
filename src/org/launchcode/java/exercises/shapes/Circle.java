package org.launchcode.java.exercises.shapes;

public class Circle extends Shape {
    // Circles have radius, need pi
    private double radius;
    private double pi = Math.PI;

    public  Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A circle with a radius of "
                + this.radius +
                " has an area of " + this.area() +
                ", and a perimeter of " + this.perimeter();
    }

    @Override
    public double area() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return (pi * radius) * 2;
    }

    public static void main(String[] args) {
        Circle chris = new Circle(3.33);
        System.out.println(chris.toString());
    }
}
