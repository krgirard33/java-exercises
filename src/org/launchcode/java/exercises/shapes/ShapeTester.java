package org.launchcode.java.exercises.shapes;

public abstract class ShapeTester extends Shape {
    public static void main(String[] args) {

        //Circle
        double radius = 2.5;
        Shape circle = new Circle(radius);
        System.out.println("A circle with a radius of "
                + radius +
                " has an area of " + circle.area() +
                ", and a perimeter of " + circle.perimeter());

        //Rectangle
        double width = 2.2, height = 4.3;
        Shape rectangle = new Rectangle(width, height);
        System.out.println("A rectangle with dimensions of " +
                "width: " + width +
                ", and height: " + height +
                ", has an area of " + rectangle.area() +
                ", and a perimeter of " + rectangle.perimeter());

        //Square
        double sqheight = 3.5;
        Shape square = new Square(sqheight);
        System.out.println("A square with dimensions of "
                + sqheight + " per side, and has an area of "
                + square.area() +
                ", and a perimeter of " + square.perimeter());

    }
}
