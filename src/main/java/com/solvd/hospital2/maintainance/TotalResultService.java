package com.solvd.hospital2.maintainance;

import com.solvd.hospital2.documentation.Receiptable;
import com.solvd.hospital2.personal_info.AnswerException;
import com.solvd.hospital2.personal_info.Healthable;
import com.solvd.hospital2.personal_info.Stayable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.Scanner;

public class TotalResultService implements Stayable, Receiptable, Healthable {

    private static final Logger LOGGER = LogManager.getLogger(TotalResultService.class);

    private Boolean availabilityCard;
    private Boolean daysStay;
    private String meds;
    private String health;
    private String result;

    public void setAvailabilityCard(Boolean availabilityCard) {
        this.availabilityCard = availabilityCard;
    }

    public Boolean getAvailabilityCard() {
        return availabilityCard;
    }

    public Boolean getDaysStay() {
        return daysStay;
    }

    public void setDaysStay(Boolean daysStay) {
        this.daysStay = daysStay;
    }

    public String getMeds() {
        return meds;
    }

    public void setMeds(String meds) {
        this.meds = meds;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public Boolean daysStay(LocalDateTime dateOfApplication, LocalDateTime now, Integer minDayStayHospital) {
        daysStay = dateOfApplication.until(now, ChronoUnit.DAYS) >= minDayStayHospital;
        return daysStay;
    }

    @Override
    public String takeMedication(String medication) throws AnswerException {
        LOGGER.info("Do you accept " + medication + " ? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        meds = scanner.next();
        if (!meds.equals("yes") && !meds.equals("no")) {
            throw new AnswerException("I don't understand what you mean");
        }
        return meds;
    }

    @Override
    public String getCondition() throws AnswerException {
        LOGGER.info("Are you feeling good? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        health = scanner.next();
        if (!health.equals("yes") && !health.equals("no")) {
            throw new AnswerException("I don't understand what you mean");
        }
        return health;
    }

    public String takeResult() {
        if (Objects.equals(meds, health)) {
            result = "Healthy";
        } else {
            LOGGER.info("You should continue treatment");
            result = "Ill";
        }
        return result;
    }

    public String getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Your decision is " + result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof TotalResultService)) return false;
        TotalResultService other = (TotalResultService) obj;
        return result.equals(other.result);
    }

    @Override
    public int hashCode() {
        return result.hashCode();
    }
}
