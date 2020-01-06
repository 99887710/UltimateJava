package codewithjeff.polymorphism;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {new Triangle(5, 3), new Rectangle(5, 5)};

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}
