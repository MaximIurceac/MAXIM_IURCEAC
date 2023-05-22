package org.example.homework_nr_13;

import java.util.Scanner;

public class Seven {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InvalidRangeException {

        System.out.println("Введите inferiorLimit");
        int inferiorLimit = scanner.nextInt();
        System.out.println("Введите superiorLimit");
        int superiorLimit = scanner.nextInt();


        int count = countDivisibleBy7Numbers(inferiorLimit, superiorLimit);
        System.out.println("7 помещается в числе '" + superiorLimit + "' " + count + " раз.");
    }

    static int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        if (inferiorLimit > superiorLimit)
            throw new InvalidRangeException("InferiorLimit больше superiorLimit");

        int count = 0;
        for (int i = inferiorLimit; i < superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        return count;
    }
}

