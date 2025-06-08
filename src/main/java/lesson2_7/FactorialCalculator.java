package lesson2_7;

public class FactorialCalculator {
    public static int factorialCalculator(int number) {
        int f = 1;
        if (number < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не вычисляется");
        }
        for (int i = 1; i <= number; i++)
            f = f * i;
        return f;
    }
}

//  позволяющую вычислить факториал числа;