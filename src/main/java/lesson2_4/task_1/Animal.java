package lesson2_4.task_1;

public class Animal {
    protected String name;
    public Animal () {
    };
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
