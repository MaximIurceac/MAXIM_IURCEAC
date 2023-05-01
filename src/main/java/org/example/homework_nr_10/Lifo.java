package org.example.homework_nr_10;

import java.util.Stack;

public class Lifo {


    public static void firstOut(){

        Stack<String> stack = new Stack<>();

            stack.push("Monday");
            stack.push("Tuesday");
            stack.push("Wednesday");
            stack.push("Thursday");
            stack.push("Friday");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("");
        System.out.println("Next element in the queue: " + stack.peek());
    }
}
