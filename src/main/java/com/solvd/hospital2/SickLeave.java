package com.solvd.hospital2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

public class SickLeave extends HospitalDocumentation {

    private static final Logger LOGGER = LogManager.getLogger(SickLeave.class);

    private static Integer sickLeaveNumber = 1;

    public SickLeave(String type, Integer number, String doctorName, LocalDateTime today) {
        super(type, number, doctorName, today);
    }

    public static Integer getSickLeaveNumber() {
        return sickLeaveNumber;
    }

    public static void setSickLeaveNumber(Integer sickLeaveNumber) {
        SickLeave.sickLeaveNumber = sickLeaveNumber;
    }

    @Override
    public void print(String result, String name, String disease, LocalDateTime dateOfApplication, LocalDateTime now,
                      String doctorName) {
        if ("Healthy".equals(result)) {
            LOGGER.info("Sick leave # " + sickLeaveNumber);
            LOGGER.info("Patient name : " + name);
            LOGGER.info("Diagnosis : " + disease);
            LOGGER.info("Sick leave issued with : " + dateOfApplication);
            LOGGER.info("End of sick leave : " + now);
            LOGGER.info("Doctor's signature : " + doctorName);
            sickLeaveNumber++;
        }
    }
}
