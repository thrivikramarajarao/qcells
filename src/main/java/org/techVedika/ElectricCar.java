package org.techVedika;

import org.techVedika.enums.*;

public class ElectricCar extends Car {

    Integer batteryCapacity;
    BatteryCapacityUnits capacityType;
    Integer maxBatteryRange;
    DistanceUnit distanceUnit;
    Integer rangeForOneHrCharge;
    ECarStatus carStatus =ECarStatus.STOPEED;
    ElectricCarInstrumentPanel electricCarInstrumentPanel;

    public ElectricCar(String brand, String modelName, CarType carType, CarColor carColor) {
        super(brand, modelName, carType, carColor);
    }

    public ElectricCar(String brand, String modelName, CarType carType, CarColor carColor, Integer batteryCapacity, BatteryCapacityUnits capacityType, Integer maxBatteryRange, DistanceUnit distanceUnit, Integer rangeForOneHrCharge) {
        super(brand, modelName, carType, carColor);
        this.batteryCapacity = batteryCapacity;
        this.capacityType = capacityType;
        this.maxBatteryRange = maxBatteryRange;
        this.distanceUnit = distanceUnit;
        this.rangeForOneHrCharge = rangeForOneHrCharge;
    }

    public ElectricCar(String brand, String modelName, CarType carType, CarColor carColor, Integer batteryCapacity, BatteryCapacityUnits capacityType, Integer maxBatteryRange, DistanceUnit distanceUnit, Integer rangeForOneHrCharge, ElectricCarInstrumentPanel electricCarInstrumentPanel) {
        super(brand, modelName, carType, carColor);
        this.batteryCapacity = batteryCapacity;
        this.capacityType = capacityType;
        this.maxBatteryRange = maxBatteryRange;
        this.distanceUnit = distanceUnit;
        this.rangeForOneHrCharge = rangeForOneHrCharge;
        this.electricCarInstrumentPanel = electricCarInstrumentPanel;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public BatteryCapacityUnits getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(BatteryCapacityUnits capacityType) {
        this.capacityType = capacityType;
    }

    public Integer getMaxBatteryRange() {
        return maxBatteryRange;
    }

    public void setMaxBatteryRange(Integer maxBatteryRange) {
        this.maxBatteryRange = maxBatteryRange;
    }

    public DistanceUnit getDistanceType() {
        return distanceUnit;
    }

    public void setDistanceType(String distanceUnit) {
        distanceUnit = distanceUnit;
    }

    public Integer getRangeForOneHrCharge() {
        return rangeForOneHrCharge;
    }

    public void setRangeForOneHrCharge(Integer rangeForOneHrCharge) {
        this.rangeForOneHrCharge = rangeForOneHrCharge;
    }

    public ECarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(ECarStatus carStatus) {
        this.carStatus = carStatus;
    }

    public ElectricCarInstrumentPanel getElectricCarInstrumentPanel() {
        return electricCarInstrumentPanel;
    }

    public void setElectricCarInstrumentPanel(ElectricCarInstrumentPanel electricCarInstrumentPanel) {
        this.electricCarInstrumentPanel = electricCarInstrumentPanel;
    }

    @Override
    public String toStringDec() {
        this.carStatus=ECarStatus.STARTED;
        return " " + Brand + " " + modelName + " ,"+batteryCapacity +" "+capacityType.getAbbreviation()+", " + carColor + "     color ";
    }
}
