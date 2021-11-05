package com.solvd.hospital2.maintainance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Medication implements Medicationable {

    private static final Logger LOGGER = LogManager.getLogger(Medication.class);

    private String disease;
    private String medication;

    public Medication(String disease) {
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    @Override
    public String getMedication(String disease) {
        switch (disease) {
            case "Fracture":
                medication = "Ketanov, 2 times a day, 3 days";
                break;
            case "HeartAche":
                medication = "Validol, 1 time a day, 1 week";
                break;
            case "Contusion":
                medication = "Paracetamol, 3 times a day, 4 days";
                break;
            case "Tonsillitis":
                medication = "Strepsils, 3 dimes a day, 1 week";
                break;
            default:
                LOGGER.info("Enter the correct disease name");
        }
        return medication;
    }

    @Override
    public String toString() {
        return "Your receipt is " + medication;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Medication)) return false;
        Medication other = (Medication) obj;
        return medication.equals(other.medication);
    }

    @Override
    public int hashCode() {
        return medication.hashCode();
    }
}
