package org.example.homework_nr_9;

public class Programmer extends Employee implements AttendTraining {

    String programmingLanguage;

    public Programmer(String name, String surname, int age, int workingHours, double salary, String programmingLanguage) {
        super(name, surname, age, workingHours, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void attendTraining() {
        System.out.println("Programmer " + getName() + " " +getSurname() + " is attending the training...");
    }
}


