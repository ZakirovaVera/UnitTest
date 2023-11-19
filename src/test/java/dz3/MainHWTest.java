package dz3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
private MainHW _sut;

    @BeforeEach
    void setUp() {
        _sut = new MainHW();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void evenOddNumberTrue() {
        assertTrue(_sut.evenOddNumber(2));
    }

    @Test
    void evenOddNumberFalse() {
        assertFalse(_sut.evenOddNumber(3));
    }

    @Test
    void numberInIntervalTrue() {
        assertTrue(_sut.numberInInterval(60));
    }

    @Test
    void numberInIntervalFalse() {
        assertFalse(_sut.numberInInterval(2));
    }
}