package com.solvd.hospital2.staff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public class Resident<E> extends Human {

    private static final Logger LOGGER = LogManager.getLogger(Resident.class);

    private String city;
    private E education;

    public Resident(String name, Date dob) {
        super(name, dob);
        this.name = name;
        this.dob = dob;
    }

    public <E> Resident(String name, Date dob, E education) {
        super();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public E getEducation() {
        return education;
    }

    public void setEducation(E education) {
        this.education = education;
    }

    @Override
    public void say() {
        LOGGER.info("Hello!");
    }

    @Override
    public String toString() {
        return "My name is " + name + " and i live in " + city;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Resident)) return false;
        Resident other = (Resident) obj;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
