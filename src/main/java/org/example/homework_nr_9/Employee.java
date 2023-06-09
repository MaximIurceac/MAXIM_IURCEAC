package org.example.homework_nr_9;

public abstract class Employee {
    private String name;
    private String surname;
    private int age;
    private int workingHours;
    private double salary;

    public Employee(String name, String surname, int age, int workingHours, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingHours = workingHours;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

