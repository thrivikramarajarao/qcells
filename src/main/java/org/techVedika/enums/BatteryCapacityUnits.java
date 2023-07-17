package org.techVedika.enums;

public enum BatteryCapacityUnits {
    KILOWATT_HOUR("kWh"),
    AMPERE_HOUR("Ah"),
    WATT_HOUR("Wh");

    private String abbreviation;

    BatteryCapacityUnits(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

