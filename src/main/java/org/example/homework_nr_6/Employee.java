package org.example.homework_nr_6;

public class Employee {
    private String name;
    private int age;
    private String division;

   public Employee(String name, int age, String division){
       this.name = name;
       this.age = age;
       this.division = division;

   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

}
