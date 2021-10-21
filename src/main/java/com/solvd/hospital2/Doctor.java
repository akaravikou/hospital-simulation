package com.solvd.hospital2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

public class Doctor extends PersonCard {

    private static final Logger LOGGER = LogManager.getLogger(Doctor.class);

    private String qualification;

    public Doctor(String name, LocalDateTime dateOfBirth, String qualification) {
        super(name, dateOfBirth);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void print() {
        super.print();
        LOGGER.info(qualification);
    }

    @Override
    public String toString() {
        return "You will be treated by a doctor" + this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Doctor)) return false;
        Doctor other = (Doctor) obj;
        return getName().equals(other.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
