package org.example.homework_nr_8;

public interface Animal {
    void eat();
    void run();
    default void drink(){
        System.out.println("Animal is drinking...");

    };

    static void sit(){
        System.out.println("Animal is sitting...");

    };
}
