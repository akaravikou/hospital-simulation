package com.solvd.hospital2.documentation;

import com.solvd.hospital2.personal_info.JobTitle;

public class EmployeeVacation {

    private String vacationDays;
    private JobTitle position;

    public EmployeeVacation(JobTitle position) {
        this.position = position;
    }

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
                break;
            default:
                break;
        }
        return vacationDays;
    }
}
