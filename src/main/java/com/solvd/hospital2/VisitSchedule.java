package com.solvd.hospital2;

public class VisitSchedule {

    private String schedule;

    Day day = Day.SUNDAY;

    public String getVisitSchedule() {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                schedule = "Visit time: 10:00 - 12:30 13:00 - 19:00";
                break;
            case SATURDAY:
                schedule = "Visit time: 15:00 - 20:00";
                break;
            case SUNDAY:
                schedule = "Visit time: 12:00 - 20:00";
                break;
        }
        return schedule;
    }
}
