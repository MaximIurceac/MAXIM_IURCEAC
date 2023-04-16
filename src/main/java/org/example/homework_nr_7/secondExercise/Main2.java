package org.example.homework_nr_7.secondExercise;

public class Main2 {
    public static void main(String[] args){

        Circle circle1 = new Circle(5);
        Square square1 = new Square(21);

        Sphere sphere1 = new Sphere(68);
        Cube cube1 = new Cube(54) ;

        System.out.println("Area of circle: " + circle1.getArea() );
        System.out.println("Area of square: " + square1.getArea() );

        System.out.println("Area of sphere: " + sphere1.getArea() );
        System.out.println("Volume of sphere: " + sphere1.getVolume() );
        System.out.println("Area of cube:  " + cube1.getArea() );
        System.out.println("Volume of cube: " + cube1.getVolume() );

    }
}
