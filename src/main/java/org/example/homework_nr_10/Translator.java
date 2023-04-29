package org.example.homework_nr_10;

import java.util.HashMap;
import java.util.Map;

public class Translator {

    public static void enRo(){

        Map<String, String> myTranslator = new HashMap<>();

            myTranslator.put("unique","unic");
            myTranslator.put("thunderstorm","furtună");
            myTranslator.put("cruel","crud");
            myTranslator.put("acquaintance","cunoștință");
            myTranslator.put("sight","vedere");
            myTranslator.put("pomegranate","rodie");
            myTranslator.put("they","ei");
            myTranslator.put("pump","pompa");
            myTranslator.put("haughty","arogant");
            myTranslator.put("unknown","necunoscut");

        System.out.println(myTranslator);
    }
}
