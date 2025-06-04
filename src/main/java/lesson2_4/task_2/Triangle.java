package lesson2_4.task_2;

public class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double p2 = perimeter() / 2;
        return Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));
    }
}
