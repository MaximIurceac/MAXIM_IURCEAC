package org.example.homework_nr_14;

import com.sun.org.apache.xpath.internal.operations.Number;

import java.io.Serializable;

public class Triple <T extends Comparable<T>, V extends Animal & Serializable, K extends Number>{

    private T tValue;
    private V vValue;
    private K kValue;


    public Triple(T tValue, V vValue, K kValue) {
        this.tValue = tValue;
        this.vValue = vValue;
        this.kValue = kValue;
    }

    public T returnTValue() {
       return tValue;
    }

    public V returnVValue() {
        return vValue;

    }

    public K returnKValue() {
        return kValue;
    }

    public void printAllValues(){
        System.out.println("T value " + tValue + "is of type " + tValue.getClass().getSimpleName());
        System.out.println("V value " + vValue + "is of type " + vValue.getClass().getSimpleName());
        System.out.println("K value " + kValue + "is of type " + kValue.getClass().getSimpleName());
    }
}
