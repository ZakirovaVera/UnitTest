package org.example.dz2;

public abstract class Vehicle {
    public Vehicle(int countWheels){
        numWheels = countWheels;
        speed = 0;
    }


    private String company;
    private String model;
    private int yearRelease;

    private int numWheels;

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed;

    public abstract void testDrive();
    public abstract void park();
}
