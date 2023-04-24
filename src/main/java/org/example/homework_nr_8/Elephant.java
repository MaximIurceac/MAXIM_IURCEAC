package org.example.homework_nr_8;

public class Elephant extends Erbivor implements Animal {

    public static void main(String[] args) {
        Animal elephant = new Elephant();
        Erbivor elephant1 = new Elephant();




        elephant.eat();
        elephant.run();
        elephant.drink();
        Animal.sit();
        elephant1.sleep();
        elephant1.move();
    }

    @Override
    public void eat() {
        System.out.println("Elephant is eating");
    }

    @Override
    public void run() {
        System.out.println("Elephant is running");

    }

    @Override
    public void sleep() {
        System.out.println("Erbivor is sleeping");
    }
}

