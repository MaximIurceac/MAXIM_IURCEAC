package org.example.homework_nr_8;

public interface Animal {
    void eat();
    void run();
    default void drink(){
    };

    static void sit(){
        System.out.println("Animal is sitting...");

    };
}
