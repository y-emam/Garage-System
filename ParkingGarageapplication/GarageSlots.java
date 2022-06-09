package com.ParkingGarageapplication;

//Manage slots of the garage from holding data to filing the data about slots
import java.util.Scanner;
public class GarageSlots extends ParkingSlot{
    int total_slots;

    public GarageSlots(double w, double d, int vehicleId, int total_slots) {
        super(w, d, vehicleId);
        this.total_slots = total_slots;
    }

    public void beforeFillSlots(){
        System.out.println("Now we have " + total_slots + "In garage");
    }
    public int afterFillSlots(){
        return (total_slots - getPcnt());
    }
}
