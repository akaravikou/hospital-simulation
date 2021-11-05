package com.solvd.hospital2.documentation;

public class Insurance {

    private Boolean insurance;

    public void setInsurance(Boolean insurance) {
        this.insurance = insurance;
    }

    public Insurance(Boolean insurance) {
        this.insurance = insurance;
    }

    public Boolean getInsurance() {
        return insurance;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Insurance)) return false;
        Insurance other = (Insurance) obj;
        return insurance.equals(other.insurance);
    }

    @Override
    public int hashCode() {
        return insurance.hashCode();
    }
}
