package com.solvd.hospital2.documentation;

import com.solvd.hospital2.documentation.Documentation;

import java.time.LocalDateTime;

public abstract class HospitalDocumentation extends Documentation {

    protected String doctorName;
    protected LocalDateTime today;

    public HospitalDocumentation(String type, Integer number, String doctorName, LocalDateTime today) {
        super(type, number);
        this.type = type;
        this.number = number;
        this.doctorName = doctorName;
        this.today = today;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public LocalDateTime getToday() {
        return today;
    }

    public void setToday(LocalDateTime today) {
        this.today = today;
    }

    public abstract void print(String result, String name, String disease, LocalDateTime dateOfApplication, LocalDateTime now,
                               String doctorName);
}
