package lesson2_4.task_1;

public class Dog extends Animal {
    public Dog (String name) {
        this.name = name;
    }

    @Override
    public void run(int meters) {
        if (meters < 500) {
            System.out.println(name + " пробежал " + meters + " м.");
        } else {
            System.out.println(name + " не может пробежать " + meters + " м.");
        }
    }

    @Override
    public void swim(int meters) {
        if (meters < 10) {
            System.out.println(name + " проплыл " + meters + " м.");
        } else {
            System.out.println(name + " не может проплыть " + meters + " м.");
        }
    }
}
