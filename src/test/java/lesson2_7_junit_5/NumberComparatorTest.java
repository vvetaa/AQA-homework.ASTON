package lesson2_7_junit_5;

import lesson2_7.NumberComparator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Сравнение двух целых чисел")
public class NumberComparatorTest {

    @DisplayName("Валидные значения")
    @ParameterizedTest
    @CsvSource({
            "5, 5, равно",
            "10, 3, больше",
            "-4, 0, меньше",
    })
    void numberComparator_ValidInput(int a, int b, String expected) {
        assertEquals(expected, NumberComparator.numberComparator(a, b));
    }
}
