package lesson2_7;

public class NumberComparator {
    public static String numberComparator(int a, int b) {
        if (a > b) {
            return "больше";
        } else if (a == b) {
            return "равно";
        } else {
            return "меньше";
        }
    }
}
