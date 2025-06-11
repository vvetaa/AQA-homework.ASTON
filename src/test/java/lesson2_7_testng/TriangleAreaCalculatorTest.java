package lesson2_7_testng;

import lesson2_7.TriangleAreaCalculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class TriangleAreaCalculatorTest {

    @DataProvider(name = "comparisonData")
    public Object[][] comparisonData() {
        return new Object[][]{
                {5, 5, 6, 12},
                {4, 7.5, 10, 13.299289219729}
        };
    }

    @Test(dataProvider = "comparisonData", testName = "Валидные значения")
    void triangleAreaCalculator_ValidInput(double a, double b, double c, double expected) {
        TriangleAreaCalculator triangleArea = new TriangleAreaCalculator();
        double result = triangleArea.triangleAreaCalculator(a, b, c);
        assertEquals(result, expected);
    }

    @Test(testName = "Исключение при отрицательном числе")
    void triangleAreaCalculator_NegativeInput() {
        TriangleAreaCalculator triangleArea = new TriangleAreaCalculator();
        assertThrows(IllegalArgumentException.class, () -> triangleArea.triangleAreaCalculator(5, -5, 6));
    }

    @Test(testName = "Исключение при нарушении неравенства треугольника")
    void triangleAreaCalculator_TriangleInequalityViolated() {
        TriangleAreaCalculator triangleArea = new TriangleAreaCalculator();
        assertThrows(IllegalArgumentException.class, () -> triangleArea.triangleAreaCalculator(4, 10, 6));
    }
}
