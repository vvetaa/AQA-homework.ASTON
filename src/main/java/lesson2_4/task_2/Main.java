package lesson2_4.task_2;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4,"Зеленый", "Желтый");
        Rectangle rectangle1 = new Rectangle(5,2,"Красный","Зеленый");
        Triangle triangle1 = new Triangle(7,7,3,"Синий", "Белый");
        circle1.printInfo();
        rectangle1.printInfo();
        triangle1.printInfo();
    }
}
