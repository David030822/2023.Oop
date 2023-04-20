package oop.labor02;

public class Rectangle {
    private double length, width;

    public Rectangle(double plength, double pwidth) {
        length = plength;
        width = pwidth;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2 * width + 2 * length;
    }
}
