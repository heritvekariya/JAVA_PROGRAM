package main;

import geometry.circle;
import geometry.rectangle;
import geometry.triangle;

public class demo {
    public static void main(String[] args) {
        // Circle instance
        circle c = new circle(5.0);
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());

        // Rectangle instance
        rectangle r = new rectangle(4.0, 6.0);
        System.out.println("\n Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter());

        // Triangle instance
        triangle t = new triangle(3.0, 4.0, 5.0);
        System.out.println("\n Triangle Area: " + t.getArea());
        System.out.println("Triangle Perimeter: " + t.getPerimeter());
    }
}
