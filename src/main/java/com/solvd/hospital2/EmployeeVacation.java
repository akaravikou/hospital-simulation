package com.solvd.hospital2;

public class EmployeeVacation {

    private String vacationDays;

    JobTitle position = JobTitle.DOCTOR;

    public String getVacationDays() {
        switch (position) {
            case CHIEF_DOCTOR:
                vacationDays = "Your vacation 32 days";
                break;
            case DOCTOR:
                vacationDays = "Your vacation 31 days";
                break;
            case NURSE:
                vacationDays = "Your vacation 28 days";
                break;
            case LABORATORY_ASSISTANT:
                vacationDays = "Your vacation 29 days";
        }
        return vacationDays;
    }
}
