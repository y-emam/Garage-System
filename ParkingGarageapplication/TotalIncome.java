package com.ParkingGarageapplication;

import java.time.LocalTime;

public class TotalIncome extends Vehicle{
    //private members
    private int totalIncome = 0;
    LocalTime time;
    public void addIncome(){
        totalIncome += getCnt() * time.getMinute() * 5;
    }

    public int totalin(){
        return totalIncome;
    }
}
