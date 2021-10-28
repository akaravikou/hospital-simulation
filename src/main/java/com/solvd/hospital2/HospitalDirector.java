package com.solvd.hospital2;

public class HospitalDirector {

    private static HospitalDirector instance;
    private String name;

    private HospitalDirector(String name) {
    }

    public static HospitalDirector getName(String name) {
        if (instance == null) {
            instance = new HospitalDirector(name);
        }
        return instance;
    }
}
