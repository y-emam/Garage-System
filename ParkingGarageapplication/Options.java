package com.ParkingGarageapplication;

import java.time.LocalTime;
import java.util.*;

public class Options {
    private int choice;
    LinkedList<Vehicle>vehicles = new LinkedList<Vehicle>();
    Vehicle vehicle;
    ParkingSlot parkingSlot;
    ParkOut parkOut;
    Time t1;
    LocalTime t2;
    TotalIncome totalIncome;
    AvailableSlots availableSlots;

    public Options() {
    }

    public void showOptions(){

        System.out.println("\t"+" *****WELCOME TO CAR PARKING System *****");

        System.out.println("1.Park In Garage");

        System.out.println("2.Park Out From Garage && Fee");

        System.out.println("3.Income");

        System.out.println("4.Available Parking Slots");

        System.out.println("5.Exit");
    }

    Scanner input = new Scanner(System.in);

    public  void DoFuncitonality(){
        System.out.println("Enter Your Choice:");
        choice = input.nextInt();
        if(choice < 1 || choice > 5){
            System.out.println("Error you must choose options from 1 to 5");
        }
        else {
            while (choice != 5 && choice > 0){
                if (choice == 1){
                    int noOfCars;
                    System.out.println("Enter number of cars that you want to park in garage");
                    noOfCars = input.nextInt();
                    String modelName;
                    int modelYear;
                    double width, depth;
                    Scanner input = new Scanner(System.in);
                    for (int i = 0; i < noOfCars; i++){
                        System.out.println("Enter model Name : ");
                        modelName = input.next();
                        System.out.println("Enter model year : ");
                        modelYear = input.nextInt();;
                        System.out.println("Enter width : ");
                        width = input.nextDouble();
                        System.out.println("Enter depth :");
                        depth = input.nextDouble();
                        vehicle = new Vehicle(modelName, modelYear, width, depth);
                    }
                    if (vehicles.size() <= noOfCars){
                        System.out.println("Park in Garage....");
                        vehicle.assignTicketVehicle();
                    }
                    else{
                        System.out.println("We are very sorry...");
                        System.out.println("No Parking slots available");
                    }
                } else if(choice == 2){
                    parkOut.parkOut(vehicle,t1);
                    System.out.println("Fees = " + (t2.getMinute() * 5) + "$" );
                } else if (choice == 3) {
                    totalIncome.totalin();
                } else if (choice == 4) {
                    System.out.println("Available slots = " + availableSlots.total_slots);
                }

                System.out.println("1.Park In Garage");

                System.out.println("2.Park Out From Garage && Fee");

                System.out.println("3.Income");

                System.out.println("4.Available Parking Slots");

                System.out.println("5.Exit");

                System.out.println("Enter Your Choice:");
                choice = input.nextInt();
            }
            System.out.println("Thank You ^_^");


        }

    }
}
