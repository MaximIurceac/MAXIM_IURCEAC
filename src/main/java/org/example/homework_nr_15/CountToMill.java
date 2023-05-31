package org.example.homework_nr_15;

public class CountToMill {
    private int i;
    private String color;


    public void doCount() {
        switch (Thread.currentThread().getName()) {
            case "Thread1":
                color = ThreadColor.ANSI_GREEN;
                break;
            case "Thread2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                System.out.println("Invalid thread");
        }

        for (int i = 0; i <= 1000000; i++) {
            System.out.println(color + "i: " + i);
        }
    }
}
