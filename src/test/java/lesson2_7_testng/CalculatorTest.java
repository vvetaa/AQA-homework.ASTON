package lesson2_7_testng;

import lesson2_7.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CalculatorTest {

    @DataProvider(name = "sumData")
    public Object[][] sumData() {
        return new Object[][]{
                {5, 5, 10},
                {-4, 2, -2}
        };
    }

    @DataProvider(name = "subtractData")
    public Object[][] subtractData() {
        return new Object[][]{
                {5, 5, 0},
                {-4, 2, -6}
        };
    }

    @DataProvider(name = "divideData")
    public Object[][] divideData() {
        return new Object[][]{
                {5, 5, 1},
                {-4, 2, -2}
        };
    }

    @DataProvider(name = "multiplyData")
    public Object[][] multiplyData() {
        return new Object[][]{
                {5, 5, 25},
                {-4, 2, -8}
        };
    }

    @Test(dataProvider = "sumData", testName = "Валидные значения для сложения")
    void sum_ValidInput(int a, int b, int expected) {
        Calculator calc = new Calculator();
        int result = calc.sum(a, b);
        assertEquals(result, expected);
    }

    @Test(dataProvider = "subtractData", testName = "Валидные значения для вычитания")
    void subtract_ValidInput(int a, int b, int expected) {
        Calculator calc = new Calculator();
        int result = calc.subtract(a, b);
        assertEquals(result, expected);
    }

    @Test(dataProvider = "divideData", testName = "Валидные значения для деления")
    void divide_ValidInput(int a, int b, double expected) {
        Calculator calc = new Calculator();
        double result = calc.divide(a, b);
        assertEquals(result, expected);
    }

    @Test(testName = "Исключение при делении на ноль")
    void calculator_ZeroInput() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

    @Test(dataProvider = "multiplyData", testName = "Валидные значения для умножения")
    void multiply_ValidInput(int a, int b, int expected) {
        Calculator calc = new Calculator();
        int result = calc.multiply(a, b);
        assertEquals(result, expected);
    }
}
