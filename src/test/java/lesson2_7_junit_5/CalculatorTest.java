package lesson2_7_junit_5;

import lesson2_7.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Арифметические действия с двумя целыми числами")
public class CalculatorTest {

    @DisplayName("Валидные значения для сложения")
    @ParameterizedTest
    @CsvSource({
            "5, 5, 10",
            "-4, 2, -2",
    })
    void sum_ValidInput(int a, int b, int expected) {
        Calculator calc = new Calculator();
        int result = calc.sum(a, b);
        assertEquals(expected, result);
    }

    @DisplayName("Валидные значения для вычитания")
    @ParameterizedTest
    @CsvSource({
            "5, 5, 0",
            "-4, 2, -6",
    })
    void subtract_ValidInput(int a, int b, int expected) {
        Calculator calc = new Calculator();
        int result = calc.subtract(a, b);
        assertEquals(expected, result);
    }

    @DisplayName("Валидные значения для деления")
    @ParameterizedTest
    @CsvSource({
            "5, 5, 1",
            "-4, 2, -2",
    })
    void divide_ValidInput(int a, int b, double expected) {
        Calculator calc = new Calculator();
        double result = calc.divide(a, b);
        assertEquals(expected, result);
    }

    @DisplayName("Исключение при делении на ноль")
    @Test
    void calculator_ZeroInput() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

    @DisplayName("Валидные значения для умножения")
    @ParameterizedTest
    @CsvSource({
            "5, 5, 25",
            "-4, 2, -8",
    })
    void multiply_ValidInput(int a, int b, int expected) {
        Calculator calc = new Calculator();
        int result = calc.multiply(a, b);
        assertEquals(expected, result);
    }
}
