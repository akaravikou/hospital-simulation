package com.solvd.hospital2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NormOfTreatment {

    private static final Logger LOGGER = LogManager.getLogger(NormOfTreatment.class);

    private static Integer minDayStayHospital = 7;

    private String decision;

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public static void setMinDayStayHospital(Integer minDayStayHospital) {
        NormOfTreatment.minDayStayHospital = minDayStayHospital;
    }

    public Integer getMinDayStayHospital() {
        return minDayStayHospital;
    }

    public void getMaxNormOfTreatment() {
        LOGGER.info("Do you want to increase your hospital stay? yes/no");
        Scanner scanner = new Scanner(System.in);
        decision = scanner.next();
        if (!decision.equals("yes") && !decision.equals("no")) {
            throw new EnterException("You enter incorrect answer");
        }
        if (decision.equals("yes")) {
            for (int i = 1; i < 10; i++) {
                LOGGER.info("For " + i + " days ? (yes/no)");
                String increase = scanner.next();
                if (!increase.equals("yes") && !increase.equals("no")) {
                    throw new EnterException("You enter incorrect answer");
                }
                if (increase.equals("yes")) {
                    LOGGER.info("Well we will increase your stay on " + i + " days");
                    break;
                } else {
                    LOGGER.info("Are you sure?");
                }
            }
        } else {
            LOGGER.info("This is your right");
        }
    }
}

