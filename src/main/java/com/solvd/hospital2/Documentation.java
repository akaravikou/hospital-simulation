package com.solvd.hospital2;

import java.time.LocalDateTime;

public abstract class Documentation {

    protected String type;
    protected Integer number;

    public Documentation(String type, Integer number) {
        this.type = type;
        this.number = number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Integer getNumber() {
        return number;
    }

    public abstract void print(String result, String name, String disease, LocalDateTime dateOfApplication, LocalDateTime now,
                               String doctorName);
}
