package org.example.homework_nr_7.secondExercise;

public class Sphere extends ThreeDimensionalShape{
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4/3 * Math.PI * radius * radius * radius;
    }
}
