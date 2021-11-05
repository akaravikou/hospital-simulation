package com.solvd.hospital2.staff;

import java.util.Date;

public abstract class Human {

    protected String name;
    protected Date dob;

    public Human(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public abstract void say();
}
