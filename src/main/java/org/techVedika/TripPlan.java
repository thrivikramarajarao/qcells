package org.techVedika;

import org.techVedika.enums.DistanceUnit;
import org.techVedika.enums.TripType;

import java.time.LocalDateTime;

public class TripPlan {

    String startingLocation;

    String destinationLocation;

    TripType tripType;

    Integer totalDistance;

    Integer distanceTraveled;

    DistanceUnit distanceUnit;

    LocalDateTime tripStartTime;

    //LocalDateTime tripEstimatedEndTime;

    LocalDateTime tripEndTime;

    //String totalTimeTakenToCompleteTrip;
    Integer rechargeOrFeualStationDistance;

    Integer chargeTimePlaned;

    Integer noOfHrLayovre;

    public TripPlan(String startingLocation, String destinationLocation, TripType tripType, Integer totalDistance, Integer distanceTraveled, DistanceUnit distanceUnit, Integer rechargeOrFeualStationDistance, Integer chargeTimePlaned, Integer noOfHrLayovre) {
        this.startingLocation = startingLocation;
        this.destinationLocation = destinationLocation;
        this.tripType = tripType;
        this.totalDistance = totalDistance;
        this.distanceTraveled = distanceTraveled;
        this.distanceUnit = distanceUnit;
        this.rechargeOrFeualStationDistance = rechargeOrFeualStationDistance;
        this.chargeTimePlaned = chargeTimePlaned;
        this.noOfHrLayovre = noOfHrLayovre;
    }

    public String getStartingLocation() {
        return startingLocation;
    }

    public void setStartingLocation(String startingLocation) {
        this.startingLocation = startingLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public TripType getTripType() {
        return tripType;
    }

    public void setTripType(TripType tripType) {
        this.tripType = tripType;
    }

    public Integer getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(Integer totalDistance) {
        this.totalDistance = totalDistance;
    }

    public Integer getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(Integer distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public DistanceUnit getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public LocalDateTime getTripStartTime() {
        return tripStartTime;
    }

    public Integer getNoOfHrLayovre() {
        return noOfHrLayovre;
    }

    public void setNoOfHrLayovre(Integer noOfHrLayovre) {
        this.noOfHrLayovre = noOfHrLayovre;
    }

    public void setTripStartTime(LocalDateTime tripStartTime) {
        this.tripStartTime = tripStartTime;
    }

    public LocalDateTime getTripEndTime() {
        return tripEndTime;
    }

    public void setTripEndTime(LocalDateTime tripEndTime) {
        this.tripEndTime = tripEndTime;
    }

    public Integer getChargeTimePlaned() {
        return chargeTimePlaned;
    }

    public void setChargeTimePlaned(Integer chargeTimePlaned) {
        this.chargeTimePlaned = chargeTimePlaned;
    }

    public void startTripDes(String startTime) {
        System.out.println("Beginning the trip at " + startingLocation + " at " + startTime);
    }

    public void endTripDes(String endTime) {
        System.out.println("Reached the destination " + destinationLocation + " at " + endTime);
    }

    public void endTripDes(String destination, String endTime) {
        System.out.println("Reached the destination " + destination + " at " + endTime);
    }


}
