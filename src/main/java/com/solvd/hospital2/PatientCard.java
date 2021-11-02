package com.solvd.hospital2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

public class PatientCard extends PersonCard {

    private static final Logger LOGGER = LogManager.getLogger(PatientCard.class);

    private String disease;
    private LocalDateTime dateOfApplication;

    public PatientCard(String name, LocalDateTime dateOfBirth, String disease, LocalDateTime dateOfApplication) {
        super(name, dateOfBirth);
        this.disease = disease;
        this.dateOfApplication = dateOfApplication;
    }

    public PatientCard(String name, String disease) {
        super(name);
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public LocalDateTime getDateOfApplication() {
        return dateOfApplication;
    }

    public void setDateOfApplication(LocalDateTime dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    public void print() {
        super.print();
        LOGGER.info(disease);
        LOGGER.info(dateOfApplication);
    }

    @Override
    public String toString() {
        return "Patient " + getName() + " disease " + disease + " your card in card field.";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
