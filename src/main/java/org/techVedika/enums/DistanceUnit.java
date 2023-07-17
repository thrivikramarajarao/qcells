package org.techVedika.enums;

public enum DistanceUnit {
    MILES("mi"),
    KILOMETERS("km");

    private String abbreviation;

    DistanceUnit(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
