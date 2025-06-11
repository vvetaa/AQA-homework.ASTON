package lesson2_7;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("4 + 8 = " + calc.sum(4,8));
        System.out.println("4 - 8 = " + calc.subtract(4, 8));
        System.out.println("4 / 8 = " + calc.divide(4, 8));
        System.out.println("4 * 8 = " + calc.multiply(4, 8));

        FactorialCalculator factorial = new FactorialCalculator();
        System.out.println("0! = " + factorial.factorialCalculator(0));

        TriangleAreaCalculator triangleArea = new TriangleAreaCalculator();
        System.out.println("S треугольника = " + triangleArea.triangleAreaCalculator(4, 6, 4));

        NumberComparator comparator = new NumberComparator();
        System.out.println("4 " + comparator.numberComparator(4,0) + " 0");
    }
}
