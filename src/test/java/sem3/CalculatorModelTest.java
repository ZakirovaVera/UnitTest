package sem3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorModelTest {
    private CalculatorModel calculatorModel;
    @BeforeEach
    void setUp() {
        calculatorModel = new CalculatorModel();
    }

    @AfterEach
    void tearDown() {
        calculatorModel = null;
    }

    @Test
    void add() {
        calculatorModel.add(3,2);
        assertEquals(5,calculatorModel.getResult());
    }

    @Test
    void subtract() {
        calculatorModel.subtract(3,2);
        assertEquals(1,calculatorModel.getResult());
    }

    @Test
    void multiply() {
        calculatorModel.multiply(3,2);
        assertEquals(6,calculatorModel.getResult());
    }

    @Test
    void divide() {
        calculatorModel.divide(4,2);
        assertEquals(2,calculatorModel.getResult());
    }
    @Test
    void divideNotNullTest() {
        assertThrows(IllegalArgumentException.class, () -> calculatorModel.divide(3, 0));
    }

    @Test
    void getResult() {
        assertEquals(0,calculatorModel.getResult());
    }
}