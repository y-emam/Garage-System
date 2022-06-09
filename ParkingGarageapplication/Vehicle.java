package com.ParkingGarageapplication;

import java.util.Scanner;

// A class which holds data about the Vehicles

public class Vehicle {

    // private members
    private static int SystemId = 0;
    private String modelName;
    private int modelYear;
    private Time time;
    private double width, depth;
    private long cost;
    private static int cnt = 0;

    public Vehicle() {
        modelName = "";
        modelYear = 0;
        depth = 0;
        width = 0;
    }

    public Vehicle(String modelName, int modelYear, double width, double depth) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.width = width;
        this.depth = depth;
    }

    // book a ticket for vehicle
    public void assignTicketVehicle() {
        time = new Time();
        cnt++;
        SystemId++;
    }


    public static int getCnt() {
        return cnt;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "modelName='" + modelName + '\'' +
                ", modelYear=" + modelYear +
                ", time=" + time +
                ", width=" + width +
                ", depth=" + depth +
                ", cost=" + cost +
                '}';
    }

}
