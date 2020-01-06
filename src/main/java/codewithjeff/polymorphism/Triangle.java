package codewithjeff.polymorphism;

public class Triangle extends Shape {

    private double bottom;
    private double height;

    public Triangle(double bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public double area() {
        return (bottom * height) / 2;
    }
}
