package com.solvd.hospital2.maintainance;

import com.solvd.hospital2.EnterException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NormOfTreatment {

    private static final Logger LOGGER = LogManager.getLogger(NormOfTreatment.class);

    private static Integer minDayStayHospital = 7;

    private String decision;
    private Integer days;

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
            IntStream.range(1, 11)
                    .forEach(x -> {
                        LOGGER.info("For " + x + " days ? (yes/no)");
                        String increase = scanner.next();
                        if ("yes".equals(increase)) {
                            days = x;
                        } else if ("no".equals(increase)) {
                            LOGGER.info("Are you sure?");
                        } else {
                            throw new EnterException("You enter incorrect answer");
                        }
                    });
            if (days != 0) {
                LOGGER.info("Well we will increase your stay on " + days + " days");
            } else {
                LOGGER.info("This is your right");
            }
        }
    }
}