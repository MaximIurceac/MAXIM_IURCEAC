package org.example.homework_nr_3;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI *(radius * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
            double area = circle.calculateArea();
                System.out.println("Площадь круга: " + area);
    }
}


