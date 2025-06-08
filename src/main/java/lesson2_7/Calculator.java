package lesson2_7;

public class Calculator {
    public static int calculator(int a, int b, String operation) {
        switch (operation) {
            case "сложение":
                return a + b;
            case "вычитание":
                return a - b;
            case "умножение":
                return a * b;
            case "деление":
                return a / b;
            default:
                throw new IllegalArgumentException("Неизвестная операция: \"" + operation + "\". Ожидаемые операции: сложение, вычитание, умножение, деление");
        }
    }
}
