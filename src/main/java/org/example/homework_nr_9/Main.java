package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //        Протестируйте классы, созданные в исполняемом классе.
    Programmer programmer1 = new Programmer("Vasia", "Pupcin", 21, 9, 3000, "Java");
    Manger manger1 = new Manger("Fedea", "Cuznetiov", 25, 10, 5500, 1 );

    programmer1.attendTraining();
    manger1.conductInterview();
    manger1.attendTraining();

        System.out.println("---------------------------------------------------");

    Employee[] workers = new Employee[]{ programmer1 , manger1};


        for (Employee employee : workers) {
            if (employee instanceof Manger) {
                ((Manger) employee).conductInterview();
            }
            if (employee instanceof AttendTraining) {
                ((AttendTraining) employee).attendTraining();
            }
        }

        System.out.println("---------------------------------------------------");

        List<AttendTraining> attendees = new ArrayList<>();
        attendees.add(new Manger("Fedea", "Cuznetiov", 25, 10, 5500, 1));
        attendees.add(new Programmer("Vasia", "Pupcin", 21, 9, 3000, "Java"));

        MeetingRoom meetingRoom = new MeetingRoom(attendees);
        meetingRoom.conductTraining();






    }
}
