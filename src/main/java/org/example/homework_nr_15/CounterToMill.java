package org.example.homework_nr_15;

public class CounterToMill extends Thread {

    private CountToMill countToMill;

    public CounterToMill(CountToMill countToMill) {
        this.countToMill = countToMill;
    }

    @Override
    public void run() {
        this.countToMill.doCount();
    }
}
