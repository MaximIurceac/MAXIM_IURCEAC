package org.example.homework_nr_13;

public class Numbers {
    public static void main(String[] args) {
        Numbers num = new Numbers();

        System.out.println(num.divisionBy(2));
        System.out.println(num.divisionBy(0));
        System.out.println(divisionBy(0));
        System.out.println(num.divisionBy(5));

    }

    public static int divisionBy(int x) {
        if (x == 0) {
            throw new IllegalArgumentException("Значение не должно быть равно 0 ");
        } else {
            return x;
        }
    }

}