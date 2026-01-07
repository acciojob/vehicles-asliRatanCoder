package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int seats;
    private int currentGear;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
        this.wheels = 0;
        this.type = "SUV";
        this.doors = 4;
        this.gears = 5;
        this.isManual = false;
        this.seats = 7;
        this.currentGear = 2;
    }

    public void steer(int direction) {
        //direction is in degrees, add it to the current direction
        this.currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction) {
        //set the values of currentSpeed and currentDirection
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop() {
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

    // public int getCurrentSpeed() {
    //     return currentSpeed;
    // }
    // public int getCurrentDirection() {
    //     return currentDirection;
    // }
    // public String getName() {
    //     return name;
    // }
    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getSeats() {
        return seats;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    protected void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }

    protected void setCurrentDirection(int direction) {
        this.currentDirection = direction;
    }

}
