package com.solvd.hospital2;

public class HospitalDirector {

    private static HospitalDirector name;

    private HospitalDirector() {
    }

    public static HospitalDirector getName() {
        if (name == null) {
            name = new HospitalDirector();
        }
        return name;
    }
}
