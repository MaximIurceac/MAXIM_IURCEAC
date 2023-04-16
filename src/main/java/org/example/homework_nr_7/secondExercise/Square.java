package org.example.homework_nr_7.secondExercise;

public class Square extends TwoDimensionalShape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
