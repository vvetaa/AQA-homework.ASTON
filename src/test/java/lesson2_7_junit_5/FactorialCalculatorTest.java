package lesson2_7_junit_5;

import lesson2_7.FactorialCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Факториал числа")
public class FactorialCalculatorTest {

    @DisplayName("Валидные значения")
    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "5, 120",
    })
    void factorialCalculator_ValidInput(int input, int expected) {
        assertEquals(expected, FactorialCalculator.factorialCalculator(input));
    }

    @DisplayName("Исключение для факториала отрицательного числа")
    @Test
    void factorialCalculator_NegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorialCalculator(-1));
    }
}
