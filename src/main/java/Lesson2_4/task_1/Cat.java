package Lesson2_4.task_1;

public class Cat extends Animal {
    public Cat (String name) {
        this.name = name;
    }

    @Override
    public void run(int meters) {
        if (meters < 200) {
            System.out.println(name + " пробежал " + meters + " м.");
        } else {
            System.out.println(name + " не может пробежать " + meters + " м.");
        }
    }

    @Override
    public void swim(int meters) {
        System.out.println(name + " не умеет плавать.");
    }
}
