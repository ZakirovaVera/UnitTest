package dz3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Проверка числа на четность")
    void evenOddNumberTrue() {
        assertTrue(_sut.evenOddNumber(2));
    }

    @Test
    @DisplayName("Проверка числа на нечетность")
    void evenOddNumberFalse() {
        assertFalse(_sut.evenOddNumber(3));
    }

    @Test
    @DisplayName("Проверка - число входит в диапазон 25-100")
    void numberInIntervalTrue() {
        assertTrue(_sut.numberInInterval(60));
    }

    @Test
    @DisplayName("Проверка - число не входит в диапазон 25-100")
    void numberInIntervalFalse() {
        assertFalse(_sut.numberInInterval(2));
    }
}