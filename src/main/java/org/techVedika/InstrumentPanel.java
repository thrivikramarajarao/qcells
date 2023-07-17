package org.techVedika;

public class InstrumentPanel {
    String media;
    boolean carLockedStatus;
    boolean engineStatus;
    boolean tierPressuereStatus;
    TripPlan tripPlan;

    public InstrumentPanel(String media, boolean carLockedStatus, boolean engineStatus, boolean tierPressuereStatus, TripPlan tripPlan) {
        this.media = media;
        this.carLockedStatus = carLockedStatus;
        this.engineStatus = engineStatus;
        this.tierPressuereStatus = tierPressuereStatus;
        this.tripPlan = tripPlan;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public boolean isCarLockedStatus() {
        return carLockedStatus;
    }

    public void setCarLockedStatus(boolean carLockedStatus) {
        this.carLockedStatus = carLockedStatus;
    }

    public boolean isEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    public boolean isTierPressuereStatus() {
        return tierPressuereStatus;
    }

    public void setTierPressuereStatus(boolean tierPressuereStatus) {
        this.tierPressuereStatus = tierPressuereStatus;
    }

    public TripPlan getTripPlan() {
        return tripPlan;
    }

    public void setTripPlan(TripPlan tripPlan) {
        this.tripPlan = tripPlan;
    }
}
