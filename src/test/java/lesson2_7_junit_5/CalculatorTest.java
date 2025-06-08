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

    @DisplayName("Валидные значения")
    @ParameterizedTest
    @CsvSource({
            "5, 5, сложение, 10",
            "10, 3, вычитание, 7",
            "-4, 2, умножение, -8",
            "16, 8, деление, 2",
    })
    void calculator_ValidInput(int a, int b, String operation, int expected) {
        assertEquals(expected, Calculator.calculator(a, b, operation));
    }

    @DisplayName("Исключение при несуществующей операции")
    @Test
    void calculator_NegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculator(5, 5, "разложить"));
    }
}
