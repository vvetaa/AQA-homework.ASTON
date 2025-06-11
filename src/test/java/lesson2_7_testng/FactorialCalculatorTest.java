package lesson2_7_testng;

import lesson2_7.FactorialCalculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class FactorialCalculatorTest {

    @DataProvider(name = "comparisonData")
    public Object[][] comparisonData() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {5, 120}
        };
    }

    @Test(dataProvider = "comparisonData", testName = "Валидные значения")
    void factorialCalculator_ValidInput(int input, int expected) {
        FactorialCalculator factorial = new FactorialCalculator();
        int result = factorial.factorialCalculator(input);
        assertEquals(result, expected);
    }

    @Test(testName = "Исключение для факториала отрицательного числа")
    void factorialCalculator_NegativeInput() {
        FactorialCalculator factorial = new FactorialCalculator();
        assertThrows(IllegalArgumentException.class, () -> factorial.factorialCalculator(-1));
    }
}
