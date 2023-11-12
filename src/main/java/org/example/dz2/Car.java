package org.example.dz2;

public class Car extends Vehicle{
    public Car(){
        super(4);
    }

    @Override
    public void testDrive() {
        setSpeed(60);
    }

    @Override
    public void park() {
        setSpeed(0);
    }
}
