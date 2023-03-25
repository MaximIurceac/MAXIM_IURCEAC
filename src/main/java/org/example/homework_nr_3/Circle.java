package org.example.homework_nr_3;

public class Circle {

    public static float calculateArea(int radius, float pi){
        float area;

        area = (radius * radius) * pi;
        return area;
    }

    public static void main(String[] args){
        float finished;
        finished = calculateArea(3, 3.14F);
        System.out.println(finished);

    }
}
