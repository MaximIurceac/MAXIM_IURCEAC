package org.example.homework_nr_3;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;

  }
    public double calculateArea() {
        return 3.14 * (radius * radius);
    }
    public static void main (String[] args) {
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();
        System.out.println(area);
    }
}


