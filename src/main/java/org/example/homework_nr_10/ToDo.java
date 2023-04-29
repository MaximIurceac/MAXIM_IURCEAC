package org.example.homework_nr_10;

import java.util.ArrayList;
import java.util.List;

public class ToDo {

    public static void toDoList(){

        List<String> listToday = new ArrayList<>();

            listToday.add("At 08:00 go to the university");
            listToday.add("At 12:00 go to lunch and eat all");
            listToday.add("At 16:00 go to home");
            listToday.add("At 18:30pm start of the course");
            listToday.add("At 21:00pm some coffee on Bemol");
            listToday.add("Go to sleep");

        listToday.forEach(e -> System.out.println(e));


//        Bonus part
        System.out.println(" ");
        System.out.println("With bonus 2:");

        listToday.replaceAll(q -> (q.replaceAll("al", "replaced String")));
        listToday.forEach(q -> System.out.println(q));


        System.out.println(" ");
        System.out.println("With bonus 1:");
        listToday.removeIf(a ->(a.startsWith("A")));
        listToday.forEach(d -> System.out.println(d));
    }
}




