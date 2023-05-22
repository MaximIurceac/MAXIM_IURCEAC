package org.example.homework_nr_13;


public class Person {

    String firstName;

    String lastName;

    int age;

    public static void main(String[] args) throws InvalidAgeException, InvalidNameException {
        try {
            Person per1 = new Person("John", "Dorean", 23);
            Person per2 = new Person("", "Clarcson", 51);
            Person per3 = new Person("David", "", 42);
            Person per4 = new Person(null, "Dorean", 84);
            Person per5 = new Person("John", "Dorean", 160);

        }catch (InvalidNameException | InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }


    public Person(String firstName, String lastName, int age) throws InvalidAgeException, InvalidNameException {

        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
            throw new InvalidNameException("Имя или фамилия равны null или пустые.");
        }
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Возраст либо ниже 0 либо выше 150");
        }


        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
