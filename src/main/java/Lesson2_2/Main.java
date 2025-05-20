package Lesson2_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords(); //1
        checkSumSign(); //2
        printColor(); //3
        compareNumbers(); //4
        System.out.println(isSumInRange(4,10)); //5
        isPositiveOrNegative(-5); //6
        System.out.println(isPositiveOrNo(0)); //7
        repeatText("тут текст", 3); //8
        System.out.println(isLeapYear(104)); //9
        invertBits(); //10
        fillArrayOneToHundred(); //11
        doubleNumbersLessThanSix(); //12
        createDiagonalMatrix(); //13
        System.out.println(Arrays.toString(createFilledArray(4, 5))); //14
    }

    public static void printThreeWords() { //задача 1
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() { //задача 2
        int a = 31;
        int b = -50;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() { //задача 3
        int value = -4;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() { //задача 4
        int a = 7;
        int b = 35;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) { //задача 5
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void isPositiveOrNegative(int a) { //задача 6
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    public static boolean isPositiveOrNo(int a) { //задача 7
        return a < 0;
    }

    public static void repeatText(String str, int a) { //задача 8
        for (var i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) { //задача 9
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void invertBits() { //задача 10
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (var i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void fillArrayOneToHundred() { //задача 11
        int[] arr = new int[100];

        for (var i = 0; i < 100; i++) {
            arr[i] = i;
        }
    }

    public static void doubleNumbersLessThanSix() { //задача 12
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (var i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void createDiagonalMatrix() { //задача 13
        int size = 3;
        int [][] table = new int[size][size];

        for (var i = 0; i < size; i++) {
            table[i][i] = 1;
            table[i][size - 1 - i] = 1;
        }

        System.out.println(Arrays.deepToString(table));
    }

    public static int[] createFilledArray(int len, int initialValue) { //задача 14
        int[] arr = new int[len];

        for (var i = 0; i < len; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }
}
