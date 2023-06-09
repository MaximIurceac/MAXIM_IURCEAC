package org.example.homework_nr_15;

public class SynCountToMill {
    private int i;


    public void synDoCount() {

        String color = null;

        switch (Thread.currentThread().getName()) {
            case "Thread3":
                color = ThreadColor.ANSI_BLUE;
                break;
            case "Thread4":
                color = ThreadColor.ANSI_RED;
                break;
            default:
                System.out.println("Invalid thread");
        }
        synchronized (this) {
            for (int d = 0; d <= 1000000; d++) {
                System.out.println(color + "d: " + d);
            }
        }
    }
}
