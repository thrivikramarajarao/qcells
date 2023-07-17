package org.techVedika;

import org.techVedika.enums.ECarStatus;

public class ElectricCarInstrumentPanel extends InstrumentPanel{

    Integer batteryChargeLevel;

    Integer rangeCanTravel;

    boolean rechargeWarning;

    Integer lastChargeingTimeInhrs;

    ECarStatus ECarStatus;

    public ElectricCarInstrumentPanel(String media, boolean carLockedStatus, boolean engineStatus, boolean tierPressuereStatus, TripPlan tripPlan, Integer batteryChargeLevel, Integer rangeCanTravel, boolean rechargeWarning, Integer lastChargeingTimeInhrs, ECarStatus ECarStatus) {
        super(media, carLockedStatus, engineStatus, tierPressuereStatus, tripPlan);
        this.batteryChargeLevel = batteryChargeLevel;
        this.rangeCanTravel = rangeCanTravel;
        this.rechargeWarning = rechargeWarning;
        this.lastChargeingTimeInhrs = lastChargeingTimeInhrs;
        this.ECarStatus = ECarStatus;
    }

    public Integer getBatteryChargeLevel() {
        return batteryChargeLevel;
    }

    public void setBatteryChargeLevel(Integer batteryChargeLevel) {
        this.batteryChargeLevel = batteryChargeLevel;
    }

    public Integer getRangeCanTravel() {
        return rangeCanTravel;
    }

    public void setRangeCanTravel(Integer rangeCanTravel) {
        this.rangeCanTravel = rangeCanTravel;
    }

    public boolean isRechargeWarning() {
        return rechargeWarning;
    }

    public void setRechargeWarning(boolean rechargeWarning) {
        this.rechargeWarning = rechargeWarning;
    }

    public Integer getLastChargeingTimeInhrs() {
        return lastChargeingTimeInhrs;
    }

    public void setLastChargeingTimeInhrs(Integer lastChargeingTimeInhrs) {
        this.lastChargeingTimeInhrs = lastChargeingTimeInhrs;
    }

    public ECarStatus getCarStatus() {
        return ECarStatus;
    }

    public void setCarStatus(ECarStatus ECarStatus) {
        this.ECarStatus = ECarStatus;
    }


}
