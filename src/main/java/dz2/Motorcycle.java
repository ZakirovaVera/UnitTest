package dz2;

public class Motorcycle extends Vehicle{
    public Motorcycle() {
        super(2);
    }

    @Override
    public void testDrive() {
        setSpeed(75);
    }

    @Override
    public void park() {
        setSpeed(0);
    }
}
