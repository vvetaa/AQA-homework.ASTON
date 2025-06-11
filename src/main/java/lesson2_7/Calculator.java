package lesson2_7;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено!");
        }
        return (double) a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
