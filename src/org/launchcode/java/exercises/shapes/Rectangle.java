package org.launchcode.java.exercises.shapes;

public class Rectangle extends Shape {
    // rectangles have width & height
    private double width, height;

    public Rectangle() {
        this(1,1);
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "A rectangle with dimensions of " +
                "width: " + this.width +
                ", and height: " + this.height +
                ", has an area of " + this.area() +
                ", and a perimeter of " + this.perimeter();
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return (height + width) *2;
    }

    public static void main(String[] arg) {
        Rectangle rex = new Rectangle(2.5,4.1);
        System.out.println(rex.toString());
    }
}
