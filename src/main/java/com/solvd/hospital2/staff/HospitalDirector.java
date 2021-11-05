package com.solvd.hospital2.staff;

public class HospitalDirector {

    private static HospitalDirector instance;
    private String name;

    private HospitalDirector(String name) {
        this.name = name;
    }

    public static HospitalDirector createInstance(String name) {
        if (instance == null) {
            instance = new HospitalDirector(name);
        }
        return instance;
    }
}
