package org.example.homework_nr_10;

public class Main {

    public static void main(String[] args) {

        System.out.println("Schedule for today:");
        ToDo.toDoList();
        System.out.println("---------------------");

        System.out.println("Vocabulary:");
        Translator.enRo();
        System.out.println("---------------------");


        System.out.println("What I see in my room:");
        UniqueValues.unique();
        System.out.println("---------------------");

        System.out.println("Days of the week:");
        Lifo.firstOut();
    }
}
