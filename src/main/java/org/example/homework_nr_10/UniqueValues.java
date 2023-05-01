package org.example.homework_nr_10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UniqueValues {
    public static void unique() {
        List<String> uniq = Arrays.asList("Book","TV","Lamp","Book","Watch","Table","Watch");
        displayCollection(uniq);


    }
    public static void displayCollection(List<String> coll){
        HashSet<String> removeDuplicates = new HashSet<>(coll);
        System.out.println(removeDuplicates);
    }

}
