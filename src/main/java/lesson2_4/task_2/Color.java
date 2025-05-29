package lesson2_4.task_2;

public abstract class Color implements Calculator {
    public String fillColor;
    public String borderColor;

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void printInfo (){
        System.out.println("  Площадь: " + area());
        System.out.println("  Периметр: " + perimeter());
        System.out.println("  Цвет заливки: " + getFillColor());
        System.out.println("  Цвет границы: " + getBorderColor());
        System.out.println();
    }
}
