package sem4.stub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testCalculateTotalCost() {
        // Создаем заглушку для CurrencyConverter
        CurrencyConverter currencyConverter = new CurrencyConverterStub();

        // Создаем экземпляр Calculator с заглушкой
        Calculator calculator = new Calculator(currencyConverter);

        // Вызываем метод calculateTotalCost с фиксированными параметрами
        double totalCost = calculator.calculateTotalCost(10.0, 3, "EUR");

        // Проверяем, что результат соответствует ожидаемому (10.0 * 3 * 50.0 = 1500.0)
        assertEquals(50.0, totalCost, 0.001); // Указываем допустимое отклонение для сравнения с плавающей точкой
    }
}