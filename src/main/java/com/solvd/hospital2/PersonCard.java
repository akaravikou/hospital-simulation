package com.solvd.hospital2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

public abstract class PersonCard {

    private static final Logger LOGGER = LogManager.getLogger(PersonCard.class);

    private String name;
    private LocalDateTime dateOfBirth;

    public PersonCard(String name, LocalDateTime dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public PersonCard(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void print() {
        LOGGER.info(name);
        LOGGER.info(dateOfBirth);
    }

    public String getName() {
        return name;
    }
}
