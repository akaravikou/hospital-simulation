package com.solvd.hospital2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public class Patient<E,D> extends Resident<E> implements Dietable {

    private static final Logger LOGGER = LogManager.getLogger(Patient.class);

    private Insurance insurance;
    private boolean vegetarian;
    private D chronicDisease;

    public Patient(String name, Date dob) {
        super(name, dob);
        this.name = name;
        this.dob = dob;
        this.vegetarian = false;
    }

    public Patient(String name, Date dob,E education) {
        super(name, dob, education);
        this.name = name;
        this.dob = dob;
        this.vegetarian = false;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setVegetarian() {
        this.vegetarian = true;
    }

    public D getChronicDisease() {
        return chronicDisease;
    }

    public void setChronicDisease(ChronicDisease chronicDisease) {
        this.chronicDisease = (D) chronicDisease;
    }

    @Override
    public String getDinnerFood() {
        return vegetarian ? "vegetarian dinner food" : "simple dinner food";
    }

    @Override
    public String getBreakfastFood() {
        return  vegetarian ? "vegetarian breakfast food" : "simple breakfast food";
    }

    @Override
    public void say() {
        LOGGER.info("I need help");
    }

    @Override
    public String toString() {
        return "My name " + name + "I have some problems with my health";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Patient)) return false;
        Patient other = (Patient) obj;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
