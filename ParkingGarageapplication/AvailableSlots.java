package com.ParkingGarageapplication;

public class AvailableSlots extends GarageSlots {
    public AvailableSlots(double w, double d, int vehicleId, int total_slots) {
        super(w, d, vehicleId, total_slots);
    }

    public int availableSlots(){
        return afterFillSlots();
    }

}
