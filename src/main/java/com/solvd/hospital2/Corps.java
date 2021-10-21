package com.solvd.hospital2;

public class Corps {

    private String type;
    private String room;

    public Corps(String type) {
        this.type = type;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Your corps number" + room;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Corps)) return false;
        Corps other = (Corps) obj;
        return room.equals(other.room);
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
}
