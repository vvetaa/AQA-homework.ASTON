package lesson2_7_junit_5;

import lesson2_7.TriangleAreaCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Найти площадь треугольника")
public class TriangleAreaCalculatorTest {

    @DisplayName("Валидные значения")
    @ParameterizedTest
    @CsvSource({
            "5, 5, 6, 12",
            "4, 7.5, 10, 13.299289219729",
    })
    void triangleAreaCalculator_ValidInput(double a, double b, double c, double expected) {
        TriangleAreaCalculator triangleArea = new TriangleAreaCalculator();
        double result = triangleArea.triangleAreaCalculator(a, b, c);
        assertEquals(expected, result);
    }

    @DisplayName("Исключение при отрицательном числе")
    @Test
    void triangleAreaCalculator_NegativeInput() {
        TriangleAreaCalculator triangleArea = new TriangleAreaCalculator();
        assertThrows(IllegalArgumentException.class, () -> triangleArea.triangleAreaCalculator(5, -5, 6));
    }

    @DisplayName("Исключение при нарушении неравенства треугольника")
    @Test
    void triangleAreaCalculator_TriangleInequalityViolated() {
        TriangleAreaCalculator triangleArea = new TriangleAreaCalculator();
        assertThrows(IllegalArgumentException.class, () -> triangleArea.triangleAreaCalculator(4, 10, 6));
    }
}
