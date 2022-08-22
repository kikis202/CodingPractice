package com.day3;

public class Car extends Vehicle {
    protected String brand = "Unknown";
    protected String model = "Unknown";

    protected String color = "white";
    protected int gears = 1;
    protected float maxSpeed = 0;
    protected float maxReverseSpeed = 0;


    public Car() {
        super();
    }

    public Car(float weight, int seatCount, float fuelTankSize, String vehicleClass, String engineType) {
        super(weight, seatCount, fuelTankSize, vehicleClass, engineType);
    }

    public Car(String brand, String model, String color, int gears, float maxSpeed, float maxReverseSpeed) {
        super();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.gears = gears;
        this.maxSpeed = maxSpeed;
        this.maxReverseSpeed = maxReverseSpeed;
    }

    public Car(float weight, int seatCount, float fuelTankSize, String vehicleClass, String engineType, String brand, String model, String color , int gears, float maxSpeed, float maxReverseSpeed) {
        super(weight, seatCount, fuelTankSize, vehicleClass, engineType);
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.gears = gears;
        this.maxSpeed = maxSpeed;
        this.maxReverseSpeed = maxReverseSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setGears(int gears) {
        if (gears < 1) {
            System.out.println("Car has at least 1 gear\n");
            return;
        }
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setMaxSpeed(float maxSpeed) {
        if (maxSpeed < 0) {
            System.out.println("Car's max speed can't be negative\n");
            return;
        }
        this.maxSpeed = maxSpeed;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxReverseSpeed(float maxReverseSpeed) {
        if (maxReverseSpeed > 0) {
            System.out.println("Car's max reversing speed can't be positive\n");
            return;
        }
        this.maxReverseSpeed = maxReverseSpeed;
    }

    public float getMaxReverseSpeed() {
        return maxReverseSpeed;
    }
}
