package lesson2_4.task_1;

public class Animal {
    public final String name;
    public static int countAnimal;

    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public void run(int meters) {
        System.out.println(name + " пробежал " + meters + " м.");
    }

    public void swim(int meters) {
        System.out.println(name + " проплыл " + meters + " м.");
    }
}
