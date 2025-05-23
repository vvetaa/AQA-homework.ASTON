package Lesson2_4;

public class Animal {
    protected String name;
    public Animal () {};
    public Animal (String name) {
        this.name = name;
    }
    public void run(int meters) {
        System.out.println(name + " пробежал " + meters + " м.");
    }
    public void swim(int meters) {
        System.out.println(name + " проплыл " + meters + " м.");
    }
}
public class Cat extends Animal {
    @Override
    public void run(int meters) {
        if (meters < 200) {
            System.out.println(name + " пробежал " + meters + " м.");
        } else {
            System.out.println(name + " не может столько пробежать");
        }
    }
}