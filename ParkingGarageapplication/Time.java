package com.ParkingGarageapplication;

import java.time.*;

// A collection of time and date variables in a class
public class Time {

    // private members
    private LocalTime startTime, endTime;
    private LocalDate startDate, endDate;

    // constructor
    public Time() {
        startTime = LocalTime.now();
        startDate = LocalDate.now();
        System.out.println("Vehicle start time: ");
        System.out.println("Day : " + startDate.getDayOfWeek());
        System.out.println("Date : " + startDate);
        System.out.println("At time : " + startTime);
    }

    // leave Time
    public void leaveTime(){
        System.out.println("Vehicle end time: ");
        endTime = LocalTime.now();
        endDate = LocalDate.now();
        System.out.println("Day : " + endDate.getDayOfWeek());
        System.out.println("Date : " + endDate);
        System.out.println("At time : " + endTime);
    }

    // calc total time
    public void totalTime(){
        System.out.println("Total time from ");
        System.out.println("Day : " + startDate.getDayOfWeek());
        System.out.println("Date : " + startDate);
        System.out.println("At time : " + startTime);
        System.out.println("To");
        System.out.println("Day : " + endDate.getDayOfWeek());
        System.out.println("Date : " + endDate);
        System.out.println("At time : " + endTime);
        System.out.println("by days " + Math.abs(endDate.getDayOfMonth() - endDate.getDayOfMonth()));
        System.out.println("Hours: "+Math.abs(endTime.getHour() - startTime.getHour()));
        System.out.println("Minutes: "+Math.abs(endTime.getMinute()- startTime.getMinute()));
        System.out.println("Seconds "+Math.abs(endTime.getSecond() - startTime.getSecond()));
    }
}
