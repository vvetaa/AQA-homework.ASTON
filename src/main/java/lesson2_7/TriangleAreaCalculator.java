package lesson2_7;

public class TriangleAreaCalculator {
    public static double triangleAreaCalculator(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны треугольника должны быть положительными числами");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Нарушено неравенство треугольника, такой треугольник невозможен");
        }
        double perimeter = a + b + c;
        double p2 = perimeter / 2;
        return Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));
    }
}
