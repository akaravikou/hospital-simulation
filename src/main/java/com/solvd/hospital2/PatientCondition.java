package com.solvd.hospital2;

public class PatientCondition {

    private String doctorAdvice;

    Condition condition = Condition.GOOD;

    public String getDoctorAdvice() {
        if (Condition.GOOD.equals(condition)) {
            doctorAdvice = "Come to the Chief Doctor tomorrow";
        } else if (Condition.NORMAL.equals(condition)) {
            doctorAdvice = "I will extend your stay in the hospital";
        } else if (Condition.BAD.equals(condition)) {
            doctorAdvice = "I will write you additional vitamins";
        }
        return doctorAdvice;
    }
}
