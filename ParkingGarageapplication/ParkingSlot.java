package com.ParkingGarageapplication;

// A class which holds info for parking slots

public class ParkingSlot {

    // private members
    private Dimension dimension;
    double w, d;
    private int vehicleId;
    private Vehicle vehicle;
    private boolean freeSlot;
    private static int pcnt = 0;

    // constructor
    public ParkingSlot(double w, double d, int vehicleId) {
        this.w = w;
        this.d = d;
        dimension = new Dimension(w,d);
        this.vehicleId = vehicleId;
    }

    public boolean assignVehicleToSlot(Vehicle vehicle) {
        this.vehicle = vehicle;
        freeSlot = false;
        return freeSlot;
    }

    public boolean removeVehicleFromSlot() {
        this.vehicle = null;
        freeSlot = true;
        return freeSlot;
    }

    public boolean IsFree(){
        return freeSlot;
    }

    // setters && getters
    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void getVehicle() {
        vehicle.toString();
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isFreeSlot() {
        return freeSlot;
    }

    public void setFreeSlot(boolean freeSlot) {
        this.freeSlot = freeSlot;
    }

    public static int getPcnt() {
        return pcnt;
    }

    public static void setPcnt(int pcnt) {
        ParkingSlot.pcnt = pcnt;
    }
}
