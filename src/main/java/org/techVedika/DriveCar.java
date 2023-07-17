package org.techVedika;

import org.techVedika.enums.ECarStatus;
import org.techVedika.enums.TripType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DriveCar {

    public void driveToTrip(Car car, TripPlan plan) {
        System.out.println();
        System.out.println();
        if (car instanceof ElectricCar) {
            ElectricCar ecar = (ElectricCar) car;
            ElectricCarInstrumentPanel panel = ecar.getElectricCarInstrumentPanel();
            car.startCar();
            plan.setTripStartTime(LocalDateTime.now());
            plan.startTripDes(this.formateDataTime(plan.getTripStartTime()));
            ecar.setCarStatus(ECarStatus.DRIVING);

            this.driveToDestination(ecar, panel, plan);
            plan.endTripDes(formateDataTime(plan.getTripEndTime()));
            ecar.setCarStatus(ECarStatus.STOPEED);
            if (plan.getTripType() == TripType.ROUND_TRIP) {
                plan.setTripStartTime(plan.getTripStartTime().plusHours(plan.getNoOfHrLayovre()));
                System.out.println("Starting return trip bank to " + plan.getStartingLocation());
                ecar.setCarStatus(ECarStatus.DRIVING);
                this.driveToDestination(ecar, panel, plan);
                plan.endTripDes(plan.getStartingLocation(), formateDataTime(plan.getTripEndTime()));
                ecar.setCarStatus(ECarStatus.STOPEED);
            }
        }
    }

    private String formateDataTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm");
        String formattedDateTime = dateTime.format(formatter);
        return formattedDateTime;
    }

    private double calculateBatteryPercentage(int remainingMiles, int totalDistance) {
        return (remainingMiles / (double) totalDistance) * 100;
    }

    private void driveToDestination(ElectricCar ecar, ElectricCarInstrumentPanel panel, TripPlan plan) {
        int currentMiles = 0;
        int chargingMilesAdded = 0;
        int initChargingPercentage = panel.getBatteryChargeLevel();
        System.out.println(this.formateDataTime(plan.getTripStartTime()) + ", " + ecar.getCarStatus() + ", " + plan.rechargeOrFeualStationDistance + " " + ecar.getDistanceType() + ", " + (plan.totalDistance - currentMiles) + " " + ecar.getDistanceType() + ", " + panel.getBatteryChargeLevel() + "%");
        while (currentMiles < plan.totalDistance) {

            try {
                if ((initChargingPercentage - panel.getBatteryChargeLevel()) >= 20) {
                    if ((plan.totalDistance - currentMiles) > ecar.getRangeForOneHrCharge()) {
                        ecar.setCarStatus(ECarStatus.CHARGING);
                        int range = 0;
                        int chargTime = plan.getChargeTimePlaned();

                        do {
                            int remainRange = (ecar.getMaxBatteryRange() / ecar.getRangeForOneHrCharge()) * chargTime;
                            range = panel.getBatteryChargeLevel() + remainRange;
                            chargingMilesAdded += ecar.getRangeForOneHrCharge();
                            if (range < 80 && chargTime < 2) {
                                chargTime++;
                            } else {
                                break;
                            }
                        } while (range < 80);
                        //For Testing only added time delay this can be edited
                        Thread.sleep(chargTime * 1000);

                        panel.setBatteryChargeLevel(range);
                        plan.setTripStartTime(plan.getTripStartTime().plusHours(chargTime));
                        System.out.println(this.formateDataTime(plan.getTripStartTime()) + " " + ecar.getCarStatus() + " " + plan.rechargeOrFeualStationDistance + " " + ecar.getDistanceType() + ", " + (plan.totalDistance - currentMiles) + " " + ecar.getDistanceType() + ", " + panel.getBatteryChargeLevel() + "%");
                        ecar.setCarStatus(ECarStatus.DRIVING);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentMiles += plan.rechargeOrFeualStationDistance;

            if (currentMiles >= plan.totalDistance) {
                plan.setTripEndTime(plan.getTripStartTime());
            } else {
                int remainingMiles = ecar.getMaxBatteryRange() - (currentMiles - chargingMilesAdded);
                panel.setBatteryChargeLevel((int) this.calculateBatteryPercentage(remainingMiles, ecar.getMaxBatteryRange()));
                plan.setTripStartTime(plan.getTripStartTime().plusHours(plan.getChargeTimePlaned()));
                System.out.println(this.formateDataTime(plan.getTripStartTime()) + ", " + ecar.getCarStatus() + ", " + plan.rechargeOrFeualStationDistance + " " + ecar.getDistanceType() + ", " + (plan.totalDistance - currentMiles) + " " + ecar.getDistanceType() + ", " + panel.getBatteryChargeLevel() + "%");
            }

        }
    }
}
