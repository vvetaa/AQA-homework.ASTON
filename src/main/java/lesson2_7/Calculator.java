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

//Создайте 2 ветки: Lesson_7_junit_5 и Lesson_7_testng.
//Напишите 4 программы:
//  позволяющую вычислить факториал числа;+
//  позволяющую найти площадь треугольника;+
/// совершающую арифметические действия с двумя целыми числами (сложение, вычитание, деление и умножение);
//  сравнивающую два целых числа.+
//Эти программы должны быть в каждой ветке
//
//
//В ветке Lesson_7_junit_5 напишите юнит-тесты для этих программ, используя Junit 5.
//
//
//В ветке Lesson_7_testng  напишите юнит-тесты для этих программ, используя TestNG.