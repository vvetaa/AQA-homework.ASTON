package lesson2_4.task_2;

import java.util.Arrays;

public interface Calculator {
    double perimeter();
    double area();
    default double perimeter(double[] sides) {
        return Arrays.stream(sides).sum();
    }
}
