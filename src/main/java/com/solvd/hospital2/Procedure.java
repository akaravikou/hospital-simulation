package com.solvd.hospital2;

public class Procedure {

    private String type;

    public Procedure(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Visit " + type + " everyday";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Procedure)) return false;
        Procedure other = (Procedure) obj;
        return type.equals(other.type);
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
}
