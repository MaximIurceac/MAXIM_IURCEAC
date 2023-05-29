package org.example.homework_nr_14;

public class ForExpend {
    public static void main(String[] args) {
        Integer value1 = 10;
        Dog value2 = new Dog();
        Double value3 = 3.14;

        Triple<Integer, Dog, Double> triple1 = new Triple<>(value1, value2, value3);
        triple1.printAllValues();
    }

}
