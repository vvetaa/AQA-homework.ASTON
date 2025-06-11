package lesson2_7_testng;

import lesson2_7.NumberComparator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberComparatorTest {

    @DataProvider(name = "comparisonData")
    public Object[][] comparisonData() {
        return new Object[][]{
                {5, 5, "равно"},
                {10, 3, "больше"},
                {-4, 0, "меньше"}
        };
    }

    @Test(dataProvider = "comparisonData", testName = "Валидные значения")
    void numberComparator_ValidInput(int a, int b, String expected) {
        NumberComparator comparator = new NumberComparator();
        String result = comparator.numberComparator(a, b);
        assertEquals(result, expected);
    }
}
