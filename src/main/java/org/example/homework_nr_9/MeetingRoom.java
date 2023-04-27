package org.example.homework_nr_9;

import java.util.List;

public class MeetingRoom {
    private List<AttendTraining> attend;

    public MeetingRoom(List<AttendTraining> attend) {
        this.attend = attend;
    }

    public void conductTraining() {
        for (AttendTraining att : attend) {
            att.attendTraining();
        }

    }
}
