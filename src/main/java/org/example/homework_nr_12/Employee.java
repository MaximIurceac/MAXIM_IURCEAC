package org.example.homework_nr_12;

import java.util.*;

public class Employee {
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>(
                Arrays.asList(
                        new Employee("Oliver", "Thomas", 21, true, false),
                        new Employee("Declan", "Smith", 29, false, true),
                        new Employee("Theodore", "Johnson", 35, true, true),
                        new Employee("Jansen", "Williams", 50, false, false),
                        new Employee("Silas", "Brown", 46, true, false),
                        new Employee("Charlotte", "Jones", 22, true, false),
                        new Employee("Aurora", "Garcia", 32, false, true),
                        new Employee("Violette", "Miller", 30, false, false),
                        new Employee("Hazel", "Davis", 38, true, true),
                        new Employee("Luna", "Rodriguez", 39, true, false)
                )
        );
        System.out.println("5 уникальных сотрудников, которые могут проводить собеседования, в возрасте старше 25 лет и получать почасовую оплату:");
        employeeList.stream()
                .filter(e -> e.getAge() > 20 && e.getCanConductInterview() && e.getPayedByHour())
                .limit(5)
                .forEach(e -> System.out.println(e));


        System.out.println("");
        System.out.println("Cписок имен сотрудников в алфавитном порядке, которые не получают почасовую оплату и старше 30 лет:");
        employeeList.stream()
                .filter(e -> e.getAge() > 30 && !e.getPayedByHour())
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(e -> System.out.println("Employee found: " + e.getName() + " " + e.getSurname()));


        System.out.println("");
        System.out.println("Первый сотрудник из списка, который может проводить интервью и получает почасовую оплату: ");
        Optional<Employee> optionalEmployee = employeeList.stream()
                .filter(Employee::getPayedByHour)
                .filter(Employee::getCanConductInterview)
                .findFirst();

        if (optionalEmployee.isPresent()) {
            System.out.println("First employee found: " + optionalEmployee.get().getName() + " " + optionalEmployee.get().getSurname());
        } else {
            System.out.println("Employee was not found!");
        }



        System.out.println("");
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSurname))
                .forEach(System.out::println);


    }

    String name;
    String surname;
    Integer age;
    Boolean isPayedByHour;
    Boolean canConductInterview;

    public Employee(String name, String surname, Integer age, Boolean isPayedByHour, Boolean canConductInterview) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isPayedByHour = isPayedByHour;
        this.canConductInterview = canConductInterview;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getPayedByHour() {
        return isPayedByHour;
    }

    public void setPayedByHour(Boolean payedByHour) {
        isPayedByHour = payedByHour;
    }

    public Boolean getCanConductInterview() {
        return canConductInterview;
    }

    public void setCanConductInterview(Boolean canConductInterview) {
        this.canConductInterview = canConductInterview;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", isPayedByHour=" + isPayedByHour +
                ", canConductInterview=" + canConductInterview +
                '}';
    }
}

