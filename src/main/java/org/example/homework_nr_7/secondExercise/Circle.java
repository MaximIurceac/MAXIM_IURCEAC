package org.example.homework_nr_7.secondExercise;

public class Circle extends TwoDimensionalShape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
