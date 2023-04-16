package org.example.homework_nr_7.firstExercise;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Anton", "Valuev");
        Student student1 = new Student("Vadim", "Calachev", "Java", 21, 300 );
        Staff staff1 = new Staff("Pavel", "Cuza", "higher education", 450 );

        System.out.println(person1);
        System.out.println(student1);
        System.out.println(staff1);

    }

}
