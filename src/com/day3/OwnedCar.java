package com.day3;

public class OwnedCar extends Car{
    private String owner = "Dealership";
    private float speed = 0;
    private int currentGear = 0;  // 0 for neural | -1 for reverse
    private float steeringAngle = 0;
    private boolean engineIgnited = false;


    public OwnedCar(){
        super();
    }
    public OwnedCar(String owner){
        super();
        this.owner = owner;
    }

    public OwnedCar(float weight, int seatCount, float fuelTankSize, String vehicleClass, String engineType) {
        super(weight, seatCount, fuelTankSize, vehicleClass, engineType);
    }
    public OwnedCar(String owner, float weight, int seatCount, float fuelTankSize, String vehicleClass, String engineType) {
        super(weight, seatCount, fuelTankSize, vehicleClass, engineType);
        this.owner = owner;
    }

    public OwnedCar(String brand, String model, String color, int gears, float maxSpeed, float maxReverseSpeed) {
        super(brand, model, color, gears, maxSpeed, maxReverseSpeed);
    }
    public OwnedCar(String owner, String brand, String model, String color, int gears, float maxSpeed, float maxReverseSpeed) {
        super(brand, model, color, gears, maxSpeed, maxReverseSpeed);
        this.owner = owner;
    }
    public OwnedCar(float weight, int seatCount, float fuelTankSize, String vehicleClass, String engineType, String brand, String model, String color , int gears, float maxSpeed, float maxReverseSpeed) {
        super(weight, seatCount, fuelTankSize, vehicleClass, engineType, brand, model, color, gears, maxSpeed, maxReverseSpeed);
    }
    public OwnedCar(String owner, float weight, int seatCount, float fuelTankSize, String vehicleClass, String engineType, String brand, String model, String color , int gears, float maxSpeed, float maxReverseSpeed) {
        super(weight, seatCount, fuelTankSize, vehicleClass, engineType, brand, model, color, gears, maxSpeed, maxReverseSpeed);
        this.owner = owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setSteeringAngle(float steeringAngle) {
        if (steeringAngle < -90 || steeringAngle > 90) {
            System.out.println("Steering angle cannot be so deep, its in range of [-90;90] degrees");
            return;
        }
        this.steeringAngle = steeringAngle;
    }

    public float getSteeringAngle() {
        return steeringAngle;
    }

    public void setCurrentGear(int gear) {
        if (gear < -1) {
            System.out.println("Car cant be in lower gear than -1\n");
            return;
        }
        if (gear > gears) {
            System.out.printf("This car has %d gears, it cannot exceed that%n", gears);
            return;
        }
        this.currentGear = gear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setSpeed(float speed) {
        if (speed > maxSpeed) {
            System.out.printf("Cars max speed is %f, it cannot reach %f, cars speed set to %f%n", maxSpeed, speed, maxSpeed);
            this.speed = maxSpeed;
            return;
        }
        if (speed < 0 - maxReverseSpeed) {
            System.out.printf("Cars max reversing speed is %f, it cannot reach %f, cars speed set to %f%n", maxReverseSpeed, speed, 0 - maxReverseSpeed);
            this.speed = 0 - maxReverseSpeed;
            return;
        }
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    public void changeSpeed(float amount) {
        this.speed += amount;
        if (speed > maxSpeed) {
            System.out.printf("Car's maximum speed reached, current car's speed: %f%n", maxSpeed);
            this.speed = maxSpeed;
            return;
        }
        if (speed < 0 - maxReverseSpeed) {
            System.out.printf("Car's maximum reversing speed reached, current car's speed: %f%n", 0 - maxReverseSpeed);
            this.speed = maxSpeed;
        }
    }

    public void toggleEngine() {
        engineIgnited = !engineIgnited;
    }
}
