package com.solvd.hospital2.maintainance;

import java.util.List;
import java.util.Set;

public class Hospital {

    private List<String> doctors;
    private Set<String> rooms;
    private Set<String> procedures;

    public void setDoctors(List<String> doctors) {
        this.doctors = doctors;
    }

    public List<String> getDoctors() {
        return doctors;
    }

    public void setRooms(Set<String> rooms) {
        this.rooms = rooms;
    }

    public Set<String> getRooms() {
        return rooms;
    }

    public void setProcedures(Set<String> procedures) {
        this.procedures = procedures;
    }

    public Set<String> getProcedures() {
        return procedures;
    }
}
