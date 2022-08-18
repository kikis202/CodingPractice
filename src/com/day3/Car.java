package com.day3;

public class Car extends Vehicle {
    protected String brand = "Unknown";
    protected String model = "Unknown";
    protected String engineType = "Unknown";
    protected String color = "white";
    protected int gears = 1;
    protected float maxSpeed = 0;
    protected float maxReverseSpeed = 0;
    protected float fuelTankSize = 0;
    protected float weight = 0;
    protected int seatCount = 0;

    public Car() {
        super();
    }

    public Car(boolean engineIgnited) {
        super(engineIgnited);
    }

    public Car(String brand, String model, String engineType, int gears, float maxSpeed, float maxReverseSpeed, float fuelTankSize, float weight, int seatCount) {
        super();
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.gears = gears;
        this.maxSpeed = maxSpeed;
        this.maxReverseSpeed = maxReverseSpeed;
        this.fuelTankSize = fuelTankSize;
        this.weight = weight;
        this.seatCount = seatCount;
    }

    public Car(boolean engineIgnited, String brand, String model, String engineType, int gears, float maxSpeed, float maxReverseSpeed, float fuelTankSize, float weight, int seatCount) {
        super(engineIgnited);
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.gears = gears;
        this.maxSpeed = maxSpeed;
        this.maxReverseSpeed = maxReverseSpeed;
        this.fuelTankSize = fuelTankSize;
        this.weight = weight;
        this.seatCount = seatCount;
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

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
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

    public void setWeight(float weight) {
        if (weight < 0) {
            System.out.println("Car's wieght can't be negative\n");
            return;
        }
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
