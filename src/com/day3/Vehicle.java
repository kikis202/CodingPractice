package com.day3;

/*
5) Vehicle
// Create a base class of a Vehicle,
// then create a Car class which inherits from the Vehicle class.
// Also, create another class, a specific type of Car that inherits from the Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.
 */

public class Vehicle {

    protected float weight = 0;
    protected int seatCount = 0;
    protected float fuelTankSize = 0;
    private String vehicleClass = "Unknown";
    protected String engineType = "Unknown";


    public Vehicle() {

    }

    public Vehicle(float weight, int seatCount, float fuelTankSize, String vehicleClass, String engineType) {
        this.weight = weight;
        this.seatCount = seatCount;
        this.fuelTankSize = fuelTankSize;
        this.vehicleClass = vehicleClass;
        this.engineType = engineType;
    }

    public void setWeight(float weight) {
        if (weight < 0) {
            System.out.println("Car's weight can't be negative\n");
            return;
        }
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setFuelTankSize(float volume) {
        if (volume < 0) {
            System.out.println("Volume can't be negative\n");
            return;
        }
        this.fuelTankSize = volume;
    }

    public float getFuelTankSize() {
        return fuelTankSize;
    }

    public void setSeatCount(int seatCount) {
        if (seatCount < 0) {
            System.out.println("Seat count can't be negative\n");
            return;
        }
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }
}
