package org.launchcode.java.exercises.shapes;

public class Square extends Rectangle {
    // Squares have width & length, but the are the same, so length
    private double height;

    public Square() {
        this(1);
    }

    public Square(double height) {
        super();
        this.height = height;
    }

    @Override
    public String toString() {
        return "A square with dimensions of "
                + this.height + " per side, " +
                "has an area of " + this.area() +
                ", and a perimeter of " + this.perimeter();
    }

    @Override
    public double area() {
        return height * height;
    }

    @Override
    public double perimeter() {
        return height * 4;
    }

    public static void main(String [] args) {
        Square steve = new Square(2.5);
        System.out.println(steve.toString());
    }
}
