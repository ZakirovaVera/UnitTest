package org.example.dz2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {
    private Motorcycle sut;

    @BeforeEach
    void setUp() {
        sut = new Motorcycle();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNumWheels() {
        assertEquals(2, sut.getNumWheels());
    }

    @Test
    void getSpeed() {
        assertEquals(0, sut.getSpeed());
    }

    @Test
    void testDrive() {
        sut.testDrive();
        assertEquals(75, sut.getSpeed());
    }

    @Test
    void park() {
        sut.park();
        assertEquals(0, sut.getSpeed());
    }
}