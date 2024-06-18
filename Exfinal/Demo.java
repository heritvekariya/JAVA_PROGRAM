package Exfinal;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double radius = 5.0;
        double area = circle.calculateArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}