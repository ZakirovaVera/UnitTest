package dz2;

import dz2.Car;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car sut;


    @BeforeEach
    void setUp() {
        sut = new Car();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNumWheels() {
        assertEquals(4, sut.getNumWheels());
    }

    @Test
    void getSpeed() {
        assertEquals(0, sut.getSpeed());
    }

    @Test
    void testDrive() {
        sut.testDrive();
        assertEquals(60, sut.getSpeed());
    }

    @Test
    void park() {
        sut.park();
        assertEquals(0, sut.getSpeed());
    }
}