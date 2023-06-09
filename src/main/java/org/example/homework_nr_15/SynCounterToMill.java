package org.example.homework_nr_15;

public class SynCounterToMill extends Thread {

    private SynCountToMill synCountToMill;

    public SynCounterToMill(SynCountToMill synCountToMill) {
        this.synCountToMill = synCountToMill;
    }

    @Override
    public void run() {
        this.synCountToMill.synDoCount();
    }
}
